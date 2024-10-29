package GymManagementSystem.Databases;

import GymManagementSystem.Records.MemberClassRegistration;
import java.time.LocalDate;

public class MemberClassRegistrationDatabase extends Database {

    //constructor
    public MemberClassRegistrationDatabase(String filename) {
        super(filename);
    }

    //methods
    @Override
    protected MemberClassRegistration createRecordFrom(String line) {
        String[] data = line.split(",");
        return new MemberClassRegistration(data[0], data[1], LocalDate.parse(data[2]), data[3]);
    }
}
