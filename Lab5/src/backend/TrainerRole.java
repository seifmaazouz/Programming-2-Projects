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
    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) throws Exception {
        Member record = new Member(memberID, name, membershipType, email, phoneNumber, status);
        String key = record.getSearchKey();
        if (memberDatabase.contains(key)) {
            throw new Exception("The Member with Id = " + key + " already exists!");
        } else {
            memberDatabase.insertRecord(record);
        }
    }

    public List<Member> getListOfMembers() {
        List<Record> records = memberDatabase.returnAllRecords();
        List<Member> members = new ArrayList<>();
        for (Record record : records) {
            members.add((Member) record);
        }
        return members;
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) throws Exception {
        Class record = new Class(classID, className, trainerID, duration, maxParticipants);
        String key = record.getSearchKey();
        if (classDatabase.contains(key)) {
            throw new Exception("The Class with Id = " + key + " already exists!");
        } else if (duration < 0 || maxParticipants < 0) {
            throw new Exception("Cannot enter a negative number!");
        } else {
            classDatabase.insertRecord(record);
        }
    }

    public List<Class> getListOfClasses() {
        List<Record> records = classDatabase.returnAllRecords();
        List<Class> classes = new ArrayList<>();
        for (Record record : records) {
            classes.add((Class) record);
        }
        return classes;
    }

    public void registerMemberForClass(String memberID, String classID, LocalDate registrationDate) throws Exception {
        Class Class = (Class) classDatabase.getRecord(classID);
        if (Class != null) {
            MemberClassRegistration registration = (MemberClassRegistration) registrationDatabase.getRecord(memberID + classID);
            if (!memberDatabase.contains(memberID)) {
                throw new Exception("Member does not exist.");
            } else if (registration != null) {
                throw new Exception("Member is already registered to this class.");
            } else {
                int availableSeats = Class.getAvailableSeats();
                if (availableSeats > 0) {
                    MemberClassRegistration record = new MemberClassRegistration(memberID, classID, registrationDate, "active");
                    registrationDatabase.insertRecord(record);
                    Class.setAvailableSeats(availableSeats - 1);
                } else {
                    throw new Exception("The Class has no available seats");
                }
            }
        } else {
            throw new Exception("The Class was not found");
        }
    }

    public void cancelRegistration(String memberID, String classID) throws Exception {
        MemberClassRegistration registration = (MemberClassRegistration) registrationDatabase.getRecord(memberID + classID);
        if (registration != null) {
            LocalDate oldDate = registration.getRegistrationDate();
            LocalDate currentDate = LocalDate.now();
            if (ChronoUnit.DAYS.between(oldDate, currentDate) > 3) {
                throw new Exception("Cancellation Failed! Passed more than 3 days.");
            }
            registrationDatabase.deleteRecord(memberID + classID);
            Class Class = (Class) classDatabase.getRecord(classID);
            int availableSeats = Class.getAvailableSeats();
            Class.setAvailableSeats(availableSeats + 1);
        } else {
            throw new Exception("Registration not found.");
        }
    }

    public List<MemberClassRegistration> getListOfRegistrations() {
        List<Record> records = registrationDatabase.returnAllRecords();
        List<MemberClassRegistration> registerations = new ArrayList<>();
        for (Record record : records) {
            registerations.add((MemberClassRegistration) record);
        }
        return registerations;
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
        System.out.println("Successfully logged out!");
    }
}
