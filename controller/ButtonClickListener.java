package controller;

import java.awt.event.*;

import model.Input;
import model.Output;
import view.KWIC;

public class ButtonClickListener implements ActionListener {

    private KWIC panel;
    public Input input = new Input();
    public Output output = new Output();

    public ButtonClickListener(KWIC panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var button = e.getSource();
        if (button == panel.getComputeButton()) {
            String userInput = panel.getTextInputArea().getText();
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