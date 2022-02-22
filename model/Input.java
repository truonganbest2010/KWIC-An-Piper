package model;

public class Input {
    CircularShift output = new CircularShift();

    public void write(String userInput) {
        // split input by new line
        String[] lines = userInput.split("\\r?\\n|\\r");
        output.read(lines);
    }

}
