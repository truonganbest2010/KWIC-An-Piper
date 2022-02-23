package model;

// Filter super class
public abstract class Filter {

    // perform filter transormation
    public abstract void transform(String[] input);

    // write resulting filter output
    public abstract void write(String[] output);
    
}
