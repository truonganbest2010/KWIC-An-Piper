package controller;

import java.awt.event.*;

import model.Input;
import view.KWIC;

public class ButtonClickListener implements ActionListener {

    private KWIC panel;
    // Input and Output filters
    public Input input;
    private String userInput = "";

    public ButtonClickListener(KWIC panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var button = e.getSource();
        if (button == panel.getComputeButton()) {
            // get user input from GUI
            userInput = panel.getTextInputArea().getText();
            // call first filter to begin processing user input
            input = new Input();
            input.write(userInput, panel);

        } else if (button == panel.getResetInputButton()) {
            userInput = "";
            panel.getTextInputArea().setText("");
        } else if (button == panel.getResetOutputButton()) {
            panel.getTextOutputArea().setText("");
        }
    }

}