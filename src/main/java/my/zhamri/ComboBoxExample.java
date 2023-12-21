package my.zhamri;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample extends JFrame implements ActionListener {

    // JComboBox and JLabel
    JComboBox<String> comboBox;
    JLabel label;

    public ComboBoxExample() {
        // Create a new frame
        setTitle("ComboBox Example");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a combo box with options
        String[] options = {"Option 1", "Option 2", "Option 3"};
        comboBox = new JComboBox<>(options);
        comboBox.setBounds(50, 50, 100, 20);

        // Create a label to display the selected item
        label = new JLabel("Select an option");
        label.setBounds(50, 100, 200, 20);

        // Add action listener to the combo box
        comboBox.addActionListener(this);

        // Add combo box and label to the frame
        add(comboBox);
        add(label);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedOption = (String) comboBox.getSelectedItem();
        label.setText("Selected: " + selectedOption);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}

