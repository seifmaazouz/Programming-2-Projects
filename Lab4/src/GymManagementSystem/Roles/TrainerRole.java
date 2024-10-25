package GymManagementSystem.Roles;

import GymManagementSystem.Records.Member;
import GymManagementSystem.Databases.MemberDatabase;
import java.time.LocalDate;
import java.util.List;

public class TrainerRole {

    private final MemberDatabase database;

    //constructor
    public TrainerRole() {
        database = new MemberDatabase("Members");
        database.readFromFile();
    }

    //methods
    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        Member record = new Member(memberID, name, membershipType, email, phoneNumber, status);
        if (database.contains(record.getSearchKey())) {
            System.out.println("Member already exists.");
        } else {
            database.insertRecord(record);
        }
    }

    public List<Member> getListOfMembers() {
        return database.returnAllRecords();
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {

    }

    public void getListOfClasses() {

    }

    public void registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {

    }

    public void cancelRegistration(String memberID, String classID) {

    }

    public void getListOfRegistrations() {

    }

    public void logout() {
        database.saveToFile();
        System.out.println("Successfully logged out!");
    }
}
