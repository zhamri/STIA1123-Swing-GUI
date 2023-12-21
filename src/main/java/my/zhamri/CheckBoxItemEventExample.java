package my.zhamri;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemEventExample extends JFrame {

    // Checkbox and label
    JCheckBox checkBox;
    JLabel label;

    public CheckBoxItemEventExample() {
        // Create a new frame
        setTitle("ItemEvent Example");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a checkbox
        checkBox = new JCheckBox("Check me");
        checkBox.setBounds(50, 50, 100, 20);

        // Create a label to display the checkbox status
        label = new JLabel("Checkbox is unchecked");
        label.setBounds(50, 80, 200, 20);

        // Add item listener to the checkbox
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Check if the checkbox is checked or unchecked
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("Checkbox is checked");
                } else {
                    label.setText("Checkbox is unchecked");
                }
            }
        });

        // Add checkbox and label to the frame
        add(checkBox);
        add(label);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxItemEventExample();
    }
}

