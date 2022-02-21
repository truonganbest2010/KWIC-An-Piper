package controller;

import java.awt.event.*;

import view.KWIC;

public class ButtonClickListener implements ActionListener {

    private KWIC panel;

    public ButtonClickListener(KWIC panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var button = e.getSource();
        if (button == panel.getComputeButton()) {
            panel.getTextOutputArea().setText(panel.getTextInputArea().getText()); // Sample func
            // The function that KWIC executes will be placed here
            //
            //
            // ---------------- //
        } else if (button == panel.getResetInputButton()) {
            panel.getTextInputArea().setText("");
        } else if (button == panel.getResetOutputButton()) {
            panel.getTextOutputArea().setText("");
        }
    }

}