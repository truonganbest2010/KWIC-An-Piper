package model;

import java.util.ArrayList;

import java.util.Arrays;

public class CircularShift extends Filter implements Pipe {

    Alphabetizer output = new Alphabetizer();
    ArrayList<String> linesList = new ArrayList<String>();

    @Override
    public void read(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                transform(words);
            }
        }

        write("abc");

    }

    @Override
    public void transform(String[] words) {

        String first = words[0];

        // circular shift each word
        for (int i = 0; i < words.length - 1; i++) {
            words[i] = words[i + 1];
        }
        words[words.length - 1] = first;

        // recombine into lines
        String wordString = "";
        for (int j = 0; j < words.length - 1; j++) {
            wordString += words[j] + " ";
        }
        wordString += words[words.length - 1];

        linesList.add(wordString);

    }

    @Override
    public void write(String wordString) {

        System.out.println("Sorted : " + Arrays.toString(linesList.toArray()));

        String[] lines = linesList.toArray(new String[0]);

        output.read(lines);
    }

}
