package model;

import java.util.Arrays;

public class Alphabetizer extends Filter implements Pipe {
    Output output = new Output();

    @Override
    public void read(String[] lines) {
        transform(lines);
    }

    @Override
    public void transform(String[] lines) {

        Arrays.sort(lines, String.CASE_INSENSITIVE_ORDER);

       // System.out.println("Sorted : " + Arrays.toString(lines));

        write(lines);
    }

    @Override
    public void write(String[] lines) {
        output.read(lines);
    }

}
