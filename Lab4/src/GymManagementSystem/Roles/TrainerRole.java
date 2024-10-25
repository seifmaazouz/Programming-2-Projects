package GymManagementSystem.Roles;

import GymManagementSystem.Records.Class;
import GymManagementSystem.Databases.ClassDatabase;
import GymManagementSystem.Records.MemberClassRegistration;
import GymManagementSystem.Databases.MemberClassRegistrationDatabase;
import GymManagementSystem.Records.Member;
import GymManagementSystem.Databases.MemberDatabase;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class TrainerRole {

    private final MemberDatabase memberDatabase;
    private final ClassDatabase classDatabase;
    private final MemberClassRegistrationDatabase registrationDatabase;

    //constructor
    public TrainerRole() {
        memberDatabase = new MemberDatabase("Members");
        classDatabase = new ClassDatabase("Class");
        registrationDatabase = new MemberClassRegistrationDatabase("Registration");
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
        return memberDatabase.returnAllRecords();
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
        return classDatabase.returnAllRecords();
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        Class Class = classDatabase.getRecord(classID);
        if (Class != null) {
            int availableSeats = Class.getAvailableSeats();
            if (availableSeats > 0) {
                MemberClassRegistration record = new MemberClassRegistration(memberID, classID, registrationDate, "active");
                registrationDatabase.insertRecord(record);
                Class.setAvailableSeats(availableSeats - 1);
                return true;
            } else {
                System.out.println("No available seats.");
            }
        } else {
            System.out.println("Class not found.");
        }
        return false;
    }

    public boolean cancelRegistration(String memberID, String classID) {
        MemberClassRegistration registration = registrationDatabase.getRecord(memberID + classID);
        if (registration != null) {
            LocalDate oldDate = registration.getRegistrationDate();
            LocalDate currentDate = LocalDate.now();
            if (ChronoUnit.DAYS.between(oldDate, currentDate) <= 3) {
                System.out.println("Refunded.");
            }
            registration.setRegistrationStatus("canceled");
            Class Class = classDatabase.getRecord(classID);
            int availableSeats = Class.getAvailableSeats();
            Class.setAvailableSeats(availableSeats + 1);
            return true;
        } else {
            System.out.println("Registration not found.");
        }
        return false;
    }

    public List<MemberClassRegistration> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
        System.out.println("Successfully logged out!");
    }
}
