package my.zhamri;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonItemEventExample extends JFrame {

    // Radio buttons
    JRadioButton option1, option2;
    JLabel label;

    public RadioButtonItemEventExample() {
        // Create a new frame
        setTitle("RadioButton ItemEvent Example");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        option1 = new JRadioButton("Option 1", true);
        option2 = new JRadioButton("Option 2");

        // Position the radio buttons
        option1.setBounds(50, 50, 100, 20);
        option2.setBounds(50, 80, 100, 20);

        // Group the radio buttons so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        // Create a label to display the selected option
        label = new JLabel("Selected: Option 1");
        label.setBounds(50, 110, 200, 20);

        // Add item listener to radio buttons
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("Selected: " + ((JRadioButton) e.getItem()).getText());
                }
            }
        };
        option1.addItemListener(itemListener);
        option2.addItemListener(itemListener);

        // Add radio buttons and label to the frame
        add(option1);
        add(option2);
        add(label);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonItemEventExample();
    }
}

