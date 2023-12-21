package my.zhamri;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample extends JFrame implements ActionListener {

    // Checkbox and label
    JCheckBox checkBox;
    JLabel label;

    public CheckBoxExample() {
        // Create a new frame
        setTitle("Checkbox Example");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a checkbox
        checkBox = new JCheckBox("Check me");
        checkBox.setBounds(50, 50, 100, 20);

        // Create a label to display the checkbox status
        label = new JLabel("Checkbox is unchecked");
        label.setBounds(50, 80, 200, 20);

        // Add action listener to the checkbox
        checkBox.addActionListener(this);

        // Add checkbox and label to the frame
        add(checkBox);
        add(label);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (checkBox.isSelected()) {
            label.setText("Checkbox is checked");
        } else {
            label.setText("Checkbox is unchecked");
        }
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}

