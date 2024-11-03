package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Database {
    private final List<Record> records;
    private final String filename;

    public Database(String filename) {
        records = new ArrayList<>();
        this.filename = filename;
    }
    
    public void readFromFile() {
        records.clear();
        File file = new File(filename);
        // check if file exists
        if(!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        // check if you have access to read file
        if(!file.canRead()) {
            System.out.println("You don't have permission to read from " + file + " file.");
            return;
        }
        try {
            Scanner fread = new Scanner(file);
            String line;
            while(fread.hasNextLine()) {
                line = fread.nextLine();
                // skip blank lines
                if(line.isBlank())
                    continue;
                records.add(createRecordFrom(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e);
        }
    }
    // helper method
    protected abstract Record createRecordFrom(String line);
    
    public List<Record> returnAllRecords() {
        return records;
    }
    
    public boolean contains(String key) {
        for(Record record : records) {
            if(record.getSearchKey().equals(key))
                return true;
        }
        return false;
    }
    
    public Record getRecord(String key) {
        for(Record record : records) {
            if(record.getSearchKey().equals(key))
                return record;
        }
        return null;
    }
    
    public void insertRecord(Record record) {
        records.add(record);
    }
    
    public void deleteRecord(String key) {
        Record record = getRecord(key);
        if(record != null) {
            records.remove(record);
            System.out.println("Record Successfully deleted.");
        }
        else
            throw new RuntimeException("The Trainer with Id = " + key + " does not exist!");
    }
    
    public void saveToFile() {
        File file = new File(filename);
        // check if file exists
        if(!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        // check if you have access to write in file
        if(!file.canWrite()) {
            System.out.println("You don't have permission to write to " + file + " file.");
            return;
        }
        try {
            FileWriter fwrite = new FileWriter(file);
            fwrite.write(""); // clear file
            for(Record record : records) {
                fwrite.append(record.lineRepresentation() + "\n");
            }
            fwrite.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
