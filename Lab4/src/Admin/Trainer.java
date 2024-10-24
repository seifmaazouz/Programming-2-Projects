package Admin;


public class Trainer {
    private String trainerId, name, email, speciality, phoneNumber;

    // constructor
    public Trainer(String trainerId, String name, String email, String speciality, String phoneNumber) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }
    
    // methods
    public String lineRepresentation () {
        return String.format("%s,%s,%s,%s,%s", trainerId, name, email, speciality, phoneNumber);
    }

    public String getSearchKey () {
        return trainerId;
    }
    
    
}
