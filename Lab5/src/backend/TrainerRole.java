package backend;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import constants.FileNames;

public class TrainerRole {

    private final MemberDatabase memberDatabase;
    private final ClassDatabase classDatabase;
    private final MemberClassRegistrationDatabase registrationDatabase;

    //constructor
    public TrainerRole() {
        memberDatabase = new MemberDatabase(FileNames.MEMBER_FILENAME);
        classDatabase = new ClassDatabase(FileNames.CLASS_FILENAME);
        registrationDatabase = new MemberClassRegistrationDatabase(FileNames.REGISTRATION_FILENAME);
        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }

    //methods
    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        Member record = new Member(memberID, name, membershipType, email, phoneNumber, status);
        if (memberDatabase.contains(record.getSearchKey())) {
            System.out.println("Member already exists.");
        } else {
            memberDatabase.insertRecord(record);
        }
    }

    public List<Member> getListOfMembers() {
        List<Record> records = memberDatabase.returnAllRecords();
        List<Member> members = new ArrayList<>();
        for(Record record : records)
            members.add((Member)record);
        return members;
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        Class record = new Class(classID, className, trainerID, duration, maxParticipants);
        if (classDatabase.contains(record.getSearchKey())) {
            System.out.println("Class already exists.");
        } else {
            classDatabase.insertRecord(record);
        }
    }

    public List<Class> getListOfClasses() {
        List<Record> records = classDatabase.returnAllRecords();
        List<Class> classes = new ArrayList<>();
        for(Record record : records)
            classes.add((Class)record);
        return classes;
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        Class Class = (Class)classDatabase.getRecord(classID);
        if (Class != null) {
            MemberClassRegistration registration = (MemberClassRegistration)registrationDatabase.getRecord(memberID + classID);
            if (!memberDatabase.contains(memberID))
                System.out.println("Member does not exist.");
            else if (registration != null && registration.getRegistrationStatus() == "active")
                System.out.println("Member is currently already registered to this class. Cannot registor again.");
            else {
                int availableSeats = Class.getAvailableSeats();
                if (availableSeats > 0) {
                    MemberClassRegistration record = new MemberClassRegistration(memberID, classID, registrationDate, "active");
                    registrationDatabase.insertRecord(record);
                    Class.setAvailableSeats(availableSeats - 1);
                    return true;
                } else {
                    System.out.println("No available seats.");
                }
            }
        } else {
            System.out.println("Class not found.");
        }
        return false;
    }

    public boolean cancelRegistration(String memberID, String classID) {
        MemberClassRegistration registration = (MemberClassRegistration)registrationDatabase.getRecord(memberID + classID);
        if (registration != null) {
            if(registration.getRegistrationStatus() != "cancelled") {
            LocalDate oldDate = registration.getRegistrationDate();
            LocalDate currentDate = LocalDate.now();
            if (ChronoUnit.DAYS.between(oldDate, currentDate) > 3) {
                System.out.println("Passed more than 3 days.");
                return false;
            }
            System.out.println("Refunded.");
            registration.setRegistrationStatus("cancelled");
            Class Class = (Class)classDatabase.getRecord(classID);
            int availableSeats = Class.getAvailableSeats();
            Class.setAvailableSeats(availableSeats + 1);
            return true;
            } else
                System.out.println("Registration has already been cancelled before.");
        } else {
            System.out.println("Registration not found.");
        }
        return false;
    }

    public List<MemberClassRegistration> getListOfRegistrations() {
        List<Record> records = registrationDatabase.returnAllRecords();
        List<MemberClassRegistration> registerations = new ArrayList<>();
        for(Record record : records)
            registerations.add((MemberClassRegistration)record);
        return registerations;
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
        System.out.println("Successfully logged out!");
    }
}