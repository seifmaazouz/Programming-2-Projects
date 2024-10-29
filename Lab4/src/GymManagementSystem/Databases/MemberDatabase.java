package GymManagementSystem.Databases;

import GymManagementSystem.Records.Member;

public class MemberDatabase extends Database {

    //constructor
    public MemberDatabase(String filename) {
        super(filename);
    }

    //methods
    @Override
    protected Member createRecordFrom(String line) {
        String[] data = line.split(",");
        return new Member(data[0], data[1], data[2], data[3], data[4], data[5]);
    }
}
