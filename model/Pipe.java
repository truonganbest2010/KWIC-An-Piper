package model;
/*Pipe interface implemented by filters to 
demonstrate pipes and filters architecture*/
public interface Pipe {
    // perform pipe operation by reading from previous filter
    public void read(String[] lines);
    
}
