package model;

import java.util.stream.*;
import java.util.Arrays;

public class Alphabetizer extends Filter implements Pipe {

    @Override
    public void read(String[] lines) {
        transform(lines);
    }

    @Override
    public void transform(String[] lines) {

        // right now sorts all small letters after big letters, I'm trying to fix that 
        Arrays.sort(lines);
        //int j = 0;

        // sort lines smallest to biggest a-z
        /*for (int i = 0; i < lines.length - 1; i++) {
            // If first is greater than second, switch them
            if (lines[i].toLowerCase().charAt(j) > lines[i + 1].toLowerCase().charAt(j)) {
                String temp = lines[i];
                lines[i] = lines[i + 1];
                lines[i + 1] = temp;
            }

            // if equal
            /*else if (lines[i].charAt(j) == lines[i + 1].charAt(j)) {
                j++;
            }
        }*/

        System.out.println("Sorted : " + Arrays.toString(lines));
    }

    @Override
    public void write(String line) {
        // write to output

    }

}
