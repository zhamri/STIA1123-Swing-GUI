package my.zhamri;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventExample extends JFrame {

    // Radio buttons and checkbox
    JRadioButton option1, option2;
    JCheckBox checkBox;
    JLabel label;

    public ItemEventExample() {
        // Create a new frame
        setTitle("ItemEvent Example");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        option1 = new JRadioButton("Radio Option 1", true);
        option2 = new JRadioButton("Radio Option 2");
        option1.setBounds(50, 50, 120, 20);
        option2.setBounds(50, 70, 120, 20);

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

        // Add item listeners
        ItemListener radioListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateLabel();
                }
            }
        };
        option1.addItemListener(radioListener);
        option2.addItemListener(radioListener);

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateLabel();
            }
        });

        // Add components to the frame
        add(option1);
        add(option2);
        add(checkBox);
        add(label);

        // Display the frame
        setVisible(true);
    }

    private void updateLabel() {
        String radioText = option1.isSelected() ? "Option 1" : "Option 2";
        String checkText = checkBox.isSelected() ? "checked" : "unchecked";
        label.setText(radioText + " selected, Checkbox " + checkText);
    }

    public static void main(String[] args) {
        new ItemEventExample();
    }
}

