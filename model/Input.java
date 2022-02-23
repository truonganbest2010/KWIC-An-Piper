package model;

/*unique filter Input, which only writes input from the user, does not read or transform*/ 
public class Input {

     // Create object to pass data through pipe to Circular Shift
    CircularShift output = new CircularShift();

    public void write(String userInput) {
        // split input into array by new line
        String[] lines = userInput.split("\\r?\\n|\\r");
        // send input through pipe to Circular Shift
        output.read(lines);
    }

}
