package GymManagementSystem;

import GymManagementSystem.Roles.*;
import GymManagementSystem.Records.*;
import java.time.LocalDate;
import java.util.List;


public class GymManagementSystem {

    public static void main(String[] args) {
        double totalMark = 0;

        // Trainer Management Test (3 Marks)
        System.out.println("Testing Trainer Management...");
        totalMark += testTrainerManagement();

        // Member Management Test (2 Marks)
        System.out.println("Testing Member Management...");
        totalMark += testMemberManagement();

        // Class Management Test (4 Marks)
        System.out.println("Testing Class Management...");
        totalMark += testClassManagement();

        // Registration Management Test (9 Marks)
        System.out.println("Testing Registration Management...");
        totalMark += testRegistrationManagement();

        // Display final score
        System.out.println("Total Score: " + totalMark + "/18");
        System.out.println("7 Marks for comparing files");

    }

    public static double testTrainerManagement() {
        // Do not Forget to Clear File
        double mark = 0;
        try {
            AdminRole admin = new AdminRole();
            // Adding Trainer Test
            admin.addTrainer("T001", "David", "david@fitlife.com", "Yoga", "0123456789");
            if (admin.getListOfTrainers().size() == 1) {
                System.out.println("Case 1 passed : Add Trainer");
                mark += 0.5;
            }
            else
            {
                System.out.println("Case 1 Failed: could not Add Trainer");
            }

            // Duplicate Trainer Test
            admin.addTrainer("T001", "David", "david@fitlife.com", "Yoga", "0123456789");
            if (admin.getListOfTrainers().size() == 1) {
                System.out.println("Case 2 passed : Trainer Duplicate should not be added");
                mark += 1;
            }
            else
            {
                System.out.println("Case 2 failed : Trainer Duplicate added which is wrong");
            }

            // Adding another Trainer Test
            admin.addTrainer("T002", "David", "david@fitlife.com", "Yoga", "0123456789");
            if (admin.getListOfTrainers().size() == 2) {
                System.out.println("Case 3 passed : Add second Trainer");
                mark += 0.5;
            }
            else
            {
                System.out.println("Case 3 failed : could not Add second Trainer");
            }


            // Removing Trainer Test
            admin.removeTrainer("T001");
            if (admin.getListOfTrainers().size() == 1) {
                System.out.println("Case 4 passed : Remove First Trainer");
                mark += 1;
            }
            else
            {
                System.out.println("Case 4 failed : could not Remove First Trainer");
            }
            admin.logout();

        } catch (Exception e) {
            System.out.println("Trainer Management Test Failed: " + e.getMessage());
        }
        return mark;
    }

    public static double testMemberManagement() {
        double mark = 0;
        try {
            TrainerRole trainer = new TrainerRole();
            // Adding Member Test
            trainer.addMember("M001", "John", "Monthly", "john@gmail.com", "0123456789", "active");
            if (trainer.getListOfMembers().size() == 1) {
                System.out.println("Case 5 passed : Add Member");
                mark += 0.5; // 1 Mark
            }
            else
            {
                System.out.println("Case 5 failed : Could not Add Member");
            }

            // Duplicate Member Test
            trainer.addMember("M001", "John", "Monthly", "john@gmail.com", "0123456789", "active");
            if (trainer.getListOfMembers().size() == 1) {
                System.out.println("Case 6 passed : Member Duplicate should not be added");
                mark += 0.5;
            }
            else
            {
                System.out.println("Case 6 failed : Member Duplicate added which is wrong");
            }

            // Verify Member Data Test
            if (trainer.getListOfMembers().get(0).getSearchKey().equals("M001")) {
                System.out.println("case 7 passed : get list of members of trainer ");
                mark += 1;
            }
            else
            {
                System.out.println("case 7 failed : member is not added to list of trainer");
            }
            trainer.logout();

        } catch (Exception e) {
            System.out.println("Member Management Test Failed: " + e.getMessage());
        }
        return mark;
    }

    public static double testClassManagement() {
        double mark = 0;
        try {
            TrainerRole trainer = new TrainerRole();

            // Adding Class Test
            trainer.addClass("C001", "Yoga", "T001", 60, 1);
            if (trainer.getListOfClasses().size() == 1) {
                System.out.println("case 8 passed : Add class");
                mark += 0.5;
            }
            else
            {
                System.out.println("case 8 failed :could not Add class");
            }

            // Prevent Duplicate Class Test
            trainer.addClass("C001", "Yoga", "T001", 60, 1);
            if(trainer.getListOfClasses().size() == 1){
                System.out.println("Case 9 passed : Class Duplicate should not be added");
                mark += 0.5;
            }
            else
            {
                System.out.println("Case 9 failed : Class Duplicate is added which is wrong");
            }

            // If member preserved from member list + Register Member to Class Test
            boolean registered = trainer.registerMemberForClass(trainer.getListOfMembers().get(0).getSearchKey() , "C001", LocalDate.now());
            if (registered && trainer.getListOfClasses().get(0).getAvailableSeats() == 0 && trainer.getListOfRegistrations().get(0).getSearchKey().equals("M001C001")) {
                System.out.println("Case 10 passed : register member to class and check that there is no available after adding member as the class only have 1 available seat ");
                mark += 1.5;
            }
            else
            {
                System.out.println("Case 10 failed : could not regsiter member to class check the format they return memberId-classId as the representation may be different at the end of line 163 ");
            }

            // Test Full Class Registration
            trainer.addMember("M004","mem4","Monthly","mem4@example.com","044","Active");
            boolean fullRegistration = trainer.registerMemberForClass("M004", "C001", LocalDate.now());
            if (!fullRegistration) {
                System.out.println("Case 11 passed : could not add memeber to a complete class");
                mark += 1.5;
            }
            else
            {
                System.out.println("Case 11 failed : add memeber to a complete class which is wrong");
            }
            trainer.logout();

        } catch (Exception e) {
            System.out.println("Class Management Test Failed: " + e.getMessage());
        }
        return mark;
    }

    public static double testRegistrationManagement() {
        double mark = 0;
        try {
            TrainerRole trainer = new TrainerRole();
            // Register Member for Non-Existed Class Test
            boolean registered = trainer.registerMemberForClass("M001", "C002", LocalDate.now());
            if (!registered) {
                System.out.println("Case 12 passed : could not add memeber to a non exisiting class");
                mark += 1;
            }
            else
            {
                System.out.println("Case 12 failed : add memeber to a non exisiting class which is wrong");
            }

            // Register Non Exist Member for Existed Class Test
            registered = trainer.registerMemberForClass("M002", "C001", LocalDate.now());
            if (!registered) {
                System.out.println("Case 13 passed : could not add a non existing member to existing class ");
                mark += 1;
            }
            else
            {
                System.out.println("Case 13 failed : add a non existing member to existing class which is wrong ");
            }

            // Register to class with No Seats
            trainer.addMember("M002","member2", "Monthly","mem2@example.com","0222","Active");
            registered = trainer.registerMemberForClass("M002", "C001", LocalDate.now());
            if (!registered) {
                System.out.println("Case 14 passed : could not add existing member to a full class ");
                mark += 2;
            }
            else
            {
                System.out.println("Case 14 failed : add a existing member to full class which is wrong ");
            }

            // Register New Member to New class
            trainer.addClass("C002","Run","T001",20,30);
            registered = trainer.registerMemberForClass("M002", "C002", LocalDate.now());
            if (registered) {
                System.out.println("Case 15 passed : add new member to a existing class ");
                mark += 1;
            }
            else
            {
                System.out.println("Case 15 failed : could not add new member to a existing class (C002)");
            }

            // Cancel Registration Test (within 3 days)
            boolean cancelled = trainer.cancelRegistration("M002", "C002");
            if (cancelled && trainer.getListOfClasses().get(1).getAvailableSeats() == 30) {
                System.out.println("Case 16 passed : cancel Registration within 3 days ");
                mark += 1;
            }
            else
            {
                System.out.println("Case 16 failed : could not cancel Registration within 3 days ");
            }

            // Test Invalid Cancellation (after 3 days)
            LocalDate oldDate = LocalDate.now().minusDays(5);
            registered = trainer.registerMemberForClass("M002", "C002", oldDate);
            System.out.println(registered);
            cancelled = trainer.cancelRegistration("M002", "C002");
            if(!cancelled){
                System.out.println("Case 17 passed :could not cancel Registration after 3 days ");
                mark += 1;
            }
            else
            {
                System.out.println("Case 17 failed : cancel Registration after 3 days which is wrong ");
            }

            trainer.addMember("M003","member3", "Monthly","mem3@example.com","0333","Active");
            registered = trainer.registerMemberForClass("M003","C002",oldDate);
            boolean invalidCancellation = trainer.cancelRegistration("M003", "C002");
            if (registered && !invalidCancellation) {
                System.out.println("Case 18 passed :Register a member with an old date and could not cancel it ");
                mark += 2;
            }
            else
            {
                System.out.println("Case 18 failed : could not register a member with an old date or cancel a Registration after 3 days ");
            }
            trainer.logout();

        } catch (Exception e) {
            System.out.println("Registration Management Test Failed: " + e.getMessage());
        }
        return mark;
    }
}
