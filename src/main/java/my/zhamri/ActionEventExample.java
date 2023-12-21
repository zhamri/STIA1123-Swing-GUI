package my.zhamri;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample extends JFrame implements ActionListener {

    // Radio buttons and checkbox
    JRadioButton option1, option2;
    JCheckBox checkBox;
    JLabel label;

    public ActionEventExample() {
        // Create a new frame
        setTitle("ActionEvent Example");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        option1 = new JRadioButton("Radio Option 1", true);
        option2 = new JRadioButton("Radio Option 2");
        option1.setBounds(50, 50, 200, 20);
        option2.setBounds(50, 70, 200, 20);

        // Create a checkbox
        checkBox = new JCheckBox("Check me");
        checkBox.setBounds(50, 100, 100, 20);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        // Create a label for displaying the state
        label = new JLabel("Option 1 selected, Checkbox unchecked");
        label.setBounds(50, 130, 400, 20);

        // Add action listeners
        option1.addActionListener(this);
        option2.addActionListener(this);
        checkBox.addActionListener(this);

        // Add components to the frame
        add(option1);
        add(option2);
        add(checkBox);
        add(label);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateLabel();
    }

    private void updateLabel() {
        String radioText = option1.isSelected() ? "Option 1" : "Option 2";
        String checkText = checkBox.isSelected() ? "checked" : "unchecked";
        label.setText(radioText + " selected, Checkbox " + checkText);
    }

    public static void main(String[] args) {
        new ActionEventExample();
    }
}

