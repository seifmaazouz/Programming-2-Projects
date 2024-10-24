package GymManagementSystem;

import GymManagementSystem.Roles.*;
import GymManagementSystem.Records.*;
import java.util.List;

public class GymManagementSystem {


    public static void main(String[] args) {
//        TrainerDatabase TDB = new TrainerDatabase("Trainers");
                
//        Trainer trainer1 = new Trainer("T1001", "John", "john@gmail.com", "Yoga", "0123456789");
//        Trainer trainer2 = new Trainer("F2002", "Tom", "tom@gmail.com", "Yoga", "0123482789");
        
//        TDB.readFromFile();
//        System.out.println(TDB.returnAllRecords());
//        
//        TDB.insertRecord(trainer1);
//        TDB.insertRecord(trainer1); // record already exists
//        TDB.insertRecord(trainer2);
//        TDB.saveToFile();
//        TDB.readFromFile();
//        System.out.println(TDB.returnAllRecords());

         AdminRole admin = new AdminRole();
         
         admin.addTrainer("T1001", "John", "john@gmail.com", "Yoga", "0123456789");
         admin.addTrainer("F2002", "Tom", "tom@gmail.com", "Yoga", "0123482789");
         
         admin.removeTrainer("F1001");
         
         List<Trainer> trainers = admin.getListOfTrainers();
         System.out.println(trainers);
         
         
         admin.logout();
    }
    
}
