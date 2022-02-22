package model;

public class Alphabetizer extends Filter implements Pipe {

    @Override
    public void read(String[] lines) {
        transform(lines);
    }

    @Override
    public void transform(String[] lines) {
        int j = 0;

        System.out.println("ENTERED TRANSFORM");

        // sort lines smallest to biggest a-z
        for (int y = 1; y < lines.length - 1; y++) {
            for (int i = 0; i < lines.length - 1; i++) {
                //System.out.println(lines[i]);
                //System.out.println(lines[y]);

                // If first is greater than second, switch them
                if (lines[i].charAt(j) > lines[y].charAt(j)) {
                    String temp = lines[i];
                    lines[i] = lines[y];
                    lines[y] = temp;
                }

                // if equal
                else if (lines[i].charAt(j) == lines[y].charAt(j)) {
                    j++;
                }
            }
        }

        for (int x = 0; x < lines.length; x++) {
            // System.out.println(lines[x]);
        }
        // System.out.print("\n");

    }

    @Override
    public void write(String line) {
        // write to output
    }

}
