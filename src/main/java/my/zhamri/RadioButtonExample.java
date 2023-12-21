package my.zhamri;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample extends JFrame implements ActionListener {

    // Radio buttons
    JRadioButton option1, option2;
    JButton submitButton;
    JLabel label;

    public RadioButtonExample() {
        // Create a new frame
        setTitle("Radio Button Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        option1 = new JRadioButton("Option 1");
        option2 = new JRadioButton("Option 2");

        // Group the radio buttons so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        // Create a button to submit the selection
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Create a label to display the selection
        label = new JLabel("Select an option");

        // Add radio buttons, button, and label to the frame
        add(option1);
        add(option2);
        add(submitButton);
        add(label);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (option1.isSelected()) {
            label.setText("Option 1 selected");
        } else if (option2.isSelected()) {
            label.setText("Option 2 selected");
        }
    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}

