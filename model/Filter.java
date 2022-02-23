package model;

import view.KWIC;

// Filter super class
public abstract class Filter implements Pipe {

    // perform filter transormation
    public abstract void transform(String[] input, KWIC panel);

    // write resulting filter output
    public abstract void write(String[] output, KWIC panel);

}
