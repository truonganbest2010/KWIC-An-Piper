package model;

import view.KWIC;

/*unique filter Output, which only reads input sent through pipe
from previous filter, does not read or transform*/
public class Output {

    public void read(String[] lines, KWIC panel) {
        String outGUI = "";
        for (int i = 0; i < lines.length; i++) {
            // System.out.println(lines[i]);
            outGUI += (i+1) + ". " + lines[i] + "\n\n";
        }
        panel.getTextOutputArea().setText("");
        panel.getTextOutputArea().setText(outGUI);
    }

}
