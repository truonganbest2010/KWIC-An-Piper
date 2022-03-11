package model;

import java.util.*;

import view.KWIC;

/* Alphabetizer filter: outputs a list of all circular shifts of all lines in ascending alphabetical order
where a<A<b<B..z<Z*/
public class Alphabetizer extends Filter {

    // Create object to pass data through pipe to Output filter
    Output output = new Output();

    // CircularShift output = new CircularShift();

    @Override
    // read input sent through pipe
    public void read(String[] lines, KWIC panel) {
        // call transform()
        transform(lines, panel);
    }

    @Override
    // transform data by ordering it
    public void transform(String[] lines, KWIC panel) {

        // sort list by case_insensitive order
        Arrays.sort(lines, String.CASE_INSENSITIVE_ORDER);

        // call write()
        write(lines, panel);
    }

    @Override
    public void write(String[] lines, KWIC panel) {
        // send through pipe to next filter
        output.read(lines, panel);
    }

}
