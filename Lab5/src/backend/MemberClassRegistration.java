package backend;

import java.time.LocalDate;

public class MemberClassRegistration implements Record {

    private String memberID, classID, status;
    private LocalDate registrationDate;

    //constructor
    public MemberClassRegistration(String memberID, String classID, LocalDate registrationDate, String status) {
        this.memberID = memberID;
        this.classID = classID;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    //methods
    public String getMemberID() {
        return memberID;
    }

    public String getClassID() {
        return classID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    
    public void setRegistrationStatus(String status) {
        this.status = status;
    }

    @Override
    public String getSearchKey() {
        return memberID + classID;
    }

    @Override
    public String lineRepresentation() {
        return String.format("%s,%s,%s,%s", memberID, classID, registrationDate.toString(), status);
    }
}
