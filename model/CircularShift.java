package model;

public class CircularShift extends Filter implements Pipe {

    @Override
    public void read(String line) {
        // split line into words
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            transform(words);
        }
    }

    @Override
    public void transform(String[] words) {
        String first = words[0];

        for (int i = 0; i < words.length - 1; i++) {
            words[i] = words[i + 1];
        }
        words[words.length-1] = first;

        write(words);

    }

    @Override
    public void write(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.print("\n");
    }

}
