package GymManagementSystem.Roles;

import GymManagementSystem.Records.Trainer;
import GymManagementSystem.Records.Record;
import GymManagementSystem.Databases.TrainerDatabase;
import java.util.ArrayList;
import java.util.List;


public class AdminRole {
    private final TrainerDatabase database;
    
    // constructor
    public AdminRole() {
         database = new TrainerDatabase("Trainers"); 
         database.readFromFile();
    }
    
    // methods
    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer record = new Trainer(trainerId, name, email, specialty, phoneNumber);
        if(database.contains(record.getSearchKey()))
            System.out.println("Trainer already exists.");
        else
            database.insertRecord(record);
    }
    
    public List<Trainer> getListOfTrainers() {
        List<Record> records = database.returnAllRecords();
        List<Trainer> trainers = new ArrayList<>();
        for(Record record : records)
            trainers.add((Trainer)record);
        return trainers;
    }
    
    public void removeTrainer(String key) {
        database.deleteRecord(key);
    }
    
    public void logout() {
        database.saveToFile();
        System.out.println("Successfully logged out!");
    }
}
