package GymManagementSystem.Records;

public class Member implements Record {

    private String memberID, name, membershipType, email, phoneNumber, status;

    //constructor
    public Member(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        this.memberID = memberID;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    //methods
    @Override
    public String lineRepresentation() {
        return String.format("%s,%s,%s,%s,%s,%s", memberID, name, membershipType, email, phoneNumber, status);
    }

    @Override
    public String getSearchKey() {
        return memberID;
    }
}
