package GymManagementSystem.Databases;

import GymManagementSystem.Records.Trainer;


public class TrainerDatabase extends Database {

    public TrainerDatabase(String filename) {
        super(filename);
    }
    
    @Override
    protected Trainer createRecordFrom(String line) {
        String[] data = line.split(",");
        return new Trainer(data[0], data[1], data[2], data[3], data[4]);
    }
}