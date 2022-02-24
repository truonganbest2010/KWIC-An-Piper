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

    /** textareas */
    private JTextArea textInputArea;
    private JTextArea textOutputArea;

    /** buttons */
    private JButton resetInputButton = new JButton("Reset Input");
    private JButton computeButton = new JButton("Compute");
    private JButton resetOutputButton = new JButton("Reset Output");

    public KWIC(JFrame window) { /** constructor */
        this.window = window;
    }

    public void init() { /** initialize program's GUI */
        Container cp = window.getContentPane();
        // ================//

        /** create top panel where program label locates */
        JPanel topPanel = new JPanel(new GridLayout(5, 1));

        /** program name label */
        JLabel pname = new JLabel("Key Word In Context System");
        pname.setFont(new Font("Courier New", Font.BOLD, 32));
        pname.setForeground(Color.blue);
        JPanel pnamePanel = new JPanel();
        pnamePanel.add(pname);
        topPanel.add(pnamePanel);

        /** school/university label */
        JLabel sname = new JLabel("University of Central Oklahoma");
        sname.setFont(new Font("Courier New", Font.BOLD, 32));
        JPanel snamePanel = new JPanel();
        snamePanel.add(sname);
        topPanel.add(snamePanel);

        /** group no. and members label */
        JLabel gname = new JLabel("Group 5: (An Truong & Piper Backer)");
        JPanel gnamePanel = new JPanel();
        gnamePanel.add(gname);
        topPanel.add(gnamePanel);

        /** input caution label */
        JTextArea cautionText = new JTextArea(
                "Please be aware only alphabet input is accepted. Any other input (e.g digits, symbol, etc.) will be ignored in processing");
        cautionText.setMargin(new Insets(10, 10, 10, 10));
        cautionText.setLineWrap(true);
        cautionText.setWrapStyleWord(true);
        cautionText.setEditable(false);
        cautionText.setBackground(Color.ORANGE);
        topPanel.add(cautionText);

        /** i/o label */
        JPanel ioPanel = new JPanel(new GridLayout(1, 2));
        ioPanel.add(new JLabel("Input", SwingConstants.CENTER));
        ioPanel.add(new JLabel("Output", SwingConstants.CENTER));
        topPanel.add(ioPanel);

        cp.add(BorderLayout.NORTH, topPanel);
        // ================//

        /** create i/o textarea where program input and output locate */
        JPanel textAreaPanel = new JPanel(new GridLayout(1, 2));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        border = BorderFactory.createStrokeBorder(new BasicStroke(6.0f));

        /** text input area */
        textInputArea = new JTextArea();
        textInputArea.setPreferredSize(new Dimension(200, 100));
        textInputArea.setText("");
        textInputArea.setBorder(border);
        textInputArea
                .setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        textInputArea.setLineWrap(true);
        textInputArea.setWrapStyleWord(true);
        textAreaPanel.add(textInputArea);

        /** text output area */
        textOutputArea = new JTextArea();
        textOutputArea.setText("");
        textOutputArea.setPreferredSize(new Dimension(200, 100));
        textOutputArea.setBorder(border);
        textOutputArea
                .setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        textOutputArea.setEditable(false);
        textOutputArea.setLineWrap(true);
        textOutputArea.setWrapStyleWord(true);
        textAreaPanel.add(textOutputArea);

        cp.add(BorderLayout.CENTER, textAreaPanel);
        // ================//

        /** create button panel */
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(resetInputButton); /** reset input */
        buttonPanel.add(computeButton); /** compute */
        buttonPanel.add(resetOutputButton); /** reset output */
        cp.add(BorderLayout.SOUTH, buttonPanel);

        /** add action listeners for buttons */
        ButtonClickListener buttonClickListener = new ButtonClickListener(this);
        resetInputButton.addActionListener(buttonClickListener);
        computeButton.addActionListener(buttonClickListener);
        resetOutputButton.addActionListener(buttonClickListener);
    }

    public JButton getResetInputButton() { /** get input button */
        return resetInputButton;
    }

    public JButton getComputeButton() { /** get compute button */
        return computeButton;
    }

    public JButton getResetOutputButton() { /** get output button */
        return resetOutputButton;
    }

    public JTextArea getTextInputArea() { /** get text input area */
        return textInputArea;
    }

    public JTextArea getTextOutputArea() { /** get text ouput area */
        return textOutputArea;
    }

}