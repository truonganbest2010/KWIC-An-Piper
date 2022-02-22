package model;

import java.util.ArrayList;

public class CircularShift extends Filter implements Pipe {

    Alphabetizer output = new Alphabetizer();

    @Override
    public void read(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                transform(words);
            }
        }

    }

    @Override
    public void transform(String[] words) {

        String first = words[0];

        // circular shift each word
        for (int i = 0; i < words.length - 1; i++) {
            words[i] = words[i + 1];
        }
        words[words.length - 1] = first;

        // recombine into array of lines
        String wordString = "";
        for (int j = 0; j < words.length - 1; j++) {
            wordString += words[j] + " ";
        }
        wordString += words[words.length - 1];

        write(wordString);

    }

    @Override
    public void write(String wordString) {
        ArrayList<String> linesList = new ArrayList<String>();
        linesList.add(wordString);

        String[] lines = linesList.toArray(new String[0]);

       /*for (int i = 0; i < lines.length; i++) {
            System.out.println("new line: " + lines[i]);
        }*/
       // System.out.print("\n");

       output.read(lines);
    }

}
