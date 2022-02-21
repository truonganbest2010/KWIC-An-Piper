package model;

public abstract class Filter {
    public Pipe input;
    public Pipe output;
    public boolean running;

    public abstract void transform(String[] words);

    public abstract void write(String[] words);
    
}
