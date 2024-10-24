package Member;

import lab4.Record;

public class Class implements Record {
    private String classID, className, trainerID;
    private int duration, availableSeats;
    
    // constructor
    public Class(String classID, String className, String trainerID, int duration, int availableSeats) {
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }
    
    // methods
    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }
    
    @Override
    public String lineRepresentation() {
        return String.format("%s,%s,%s,%d,%d", classID, className, trainerID, duration, availableSeats);
    }
    
    @Override
    public String getSearchKey() {
        return classID;
    }
}
