package backend;

import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;
import constants.FileNames;

public class AdminRole {
    private final TrainerDatabase database;
    
    // constructor
    public AdminRole() {
         database = new TrainerDatabase(FileNames.TRAINER_FILENAME); 
         database.readFromFile();
    }
    
    // methods
    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer record = new Trainer(trainerId, name, email, specialty, phoneNumber);
        String key = record.getSearchKey();
        if(database.contains(key))
            throw new RuntimeException("The Trainer with Id = " + key + " already exists.");
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
