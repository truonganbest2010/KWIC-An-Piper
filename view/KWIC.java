package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import controller.ButtonClickListener;

import java.awt.*;

public class KWIC {

    private JFrame window;
    private JTextArea textInputArea;
    private JTextArea textOutputArea;

    private JButton resetInputButton = new JButton("Reset Input");
    private JButton computeButton = new JButton("Compute");
    private JButton resetOutputButton = new JButton("Reset Output");

    public KWIC(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel namePanel = new JPanel(new GridLayout(4, 1));
        JLabel pname = new JLabel();
        pname.setText("Key Word In Context System\r\n");
        pname.setFont(new Font("Courier New", Font.BOLD, 32));
        pname.setForeground(Color.blue);
        JPanel pnamePanel = new JPanel();
        pnamePanel.add(pname);
        namePanel.add(pnamePanel);

        JLabel sname = new JLabel();
        sname.setText("University of Central Oklahoma\r\n");
        sname.setFont(new Font("Courier New", Font.BOLD, 32));
        JPanel snamePanel = new JPanel();
        snamePanel.add(sname);
        namePanel.add(snamePanel);

        JLabel gname = new JLabel();
        gname.setText("Group 5: (An Truong & Piper Backer)");
        JPanel gnamePanel = new JPanel();
        gnamePanel.add(gname);
        namePanel.add(gnamePanel);

        JPanel ioPanel = new JPanel(new GridLayout(1, 2));
        ioPanel.add(new JLabel("Input", SwingConstants.CENTER));
        ioPanel.add(new JLabel("Output", SwingConstants.CENTER));
        namePanel.add(ioPanel);
        cp.add(BorderLayout.NORTH, namePanel);
        // ================//

        JPanel textAreaPanel = new JPanel(new GridLayout(1, 2));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        border = BorderFactory.createStrokeBorder(new BasicStroke(6.0f));

        textInputArea = new JTextArea();
        textInputArea.setPreferredSize(new Dimension(200, 100));
        textInputArea.setText("");
        textInputArea.setBorder(border);
        textAreaPanel.add(textInputArea);
        // ---//
        textOutputArea = new JTextArea();
        textOutputArea.setText("");
        textOutputArea.setPreferredSize(new Dimension(200, 100));
        textOutputArea.setBorder(border);
        textOutputArea.setEditable(false);
        textAreaPanel.add(textOutputArea);
        cp.add(BorderLayout.CENTER, textAreaPanel);
        // ================//
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(resetInputButton);
        buttonPanel.add(computeButton);
        buttonPanel.add(resetOutputButton);
        cp.add(BorderLayout.SOUTH, buttonPanel);

        ButtonClickListener buttonClickListener = new ButtonClickListener(this);
        resetInputButton.addActionListener(buttonClickListener);
        computeButton.addActionListener(buttonClickListener);
        resetOutputButton.addActionListener(buttonClickListener);
    }

    public JButton getResetInputButton() {
        return resetInputButton;
    }

    public JButton getComputeButton() {
        return computeButton;
    }

    public JButton getResetOutputButton() {
        return resetOutputButton;
    }

    public JTextArea getTextInputArea() {
        return textInputArea;
    }

    public JTextArea getTextOutputArea() {
        return textOutputArea;
    }

}