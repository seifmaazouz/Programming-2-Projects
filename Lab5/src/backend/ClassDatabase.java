package backend;

public class ClassDatabase extends Database {

    public ClassDatabase(String filename) {
        super(filename);
    }
    
    // helper method so protected
    @Override
    protected Class createRecordFrom(String line) {
        String[] data = line.split(",");
        return new Class(data[0], data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
    }
}
