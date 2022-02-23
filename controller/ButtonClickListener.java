package controller;

import java.awt.event.*;

import model.Input;
import model.Output;
import view.KWIC;

public class ButtonClickListener implements ActionListener {

    private KWIC panel;
    // Input and Output filters
    public Input input = new Input();
    public Output output = new Output();

    public ButtonClickListener(KWIC panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var button = e.getSource();
        if (button == panel.getComputeButton()) {
            // get user input from GUI
            String userInput = panel.getTextInputArea().getText();
            // call first filter to begin processing user input
            input.write(userInput);
            //String output = output.read();
            //panel.getTextOutputArea().setText(output); 
        } else if (button == panel.getResetInputButton()) {
            panel.getTextInputArea().setText("");
        } else if (button == panel.getResetOutputButton()) {
            panel.getTextOutputArea().setText("");
        }
    }

}