package model;

public class Input {
    CircularShift output = new CircularShift();

    public void write(String userInput) {
        String[] lines = userInput.split("\\r?\\n|\\r");
        // for each line entered by user, read
        for (int i = 0; i < lines.length; i++) {
            output.read(lines[i]);
        }
    }

}
