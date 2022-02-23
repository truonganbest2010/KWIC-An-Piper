package model;

import java.util.*;
/* Alphabetizer filter: outputs a list of all circular shifts of all lines in ascending alphabetical order
where a<A<b<B..z<Z*/
public class Alphabetizer extends Filter implements Pipe {
    // Create object to pass data through pipe to Output filter
    Output output = new Output();

    @Override
    // read input sent through pipe
    public void read(String[] lines) {
        // call transform()
        transform(lines);
    }

    @Override
    // transform data by ordering it
    public void transform(String[] lines) {

        // sort list by case_insensitive order
        Arrays.sort(lines, String.CASE_INSENSITIVE_ORDER);

        // call write()
        write(lines);
    }

    @Override
    public void write(String[] lines) {
        // send through pipe to next filter
        output.read(lines);
    }

}
