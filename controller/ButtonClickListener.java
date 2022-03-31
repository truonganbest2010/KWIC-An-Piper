package controller;

import java.awt.event.*;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import model.Input;
import view.KWIC;

public class ButtonClickListener implements ActionListener {

    private KWIC panel;
    public Input input; // input filter */
    private String userInput;
    private long startTime, endTime, timeLapse;

    public ButtonClickListener(KWIC panel) { /** constructor */
        this.panel = panel;
        this.userInput = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) { /** overriden action listeners */
        var button = e.getSource();
        if (button == panel.getComputeButton()) { /** compute button */
            // get user input from GUI
            userInput = "";
            userInput = panel.getTextInputArea().getText();
            // call first filter to begin processing user input
            startTime = Instant.now().toEpochMilli();
            input = new Input();
            input.write(userInput, panel);
            endTime = Instant.now().toEpochMilli();

            timeLapse = endTime - startTime;

            System.out.println("Time of process: " + timeLapse);

        } else if (button == panel.getResetInputButton()) { /** reset input button */
            userInput = "";
            panel.getTextInputArea().setText("");
        } else if (button == panel.getResetOutputButton()) { /** reset output button */
            panel.getTextOutputArea().setText("");
        }
    }

}