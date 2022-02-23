package model;

/*unique filter Output, which only reads input sent through pipe
from previous filter, does not read or transform*/
public class Output {

    public void read(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
        return;
    }

}
