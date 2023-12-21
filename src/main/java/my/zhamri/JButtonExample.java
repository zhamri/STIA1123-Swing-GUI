package my.zhamri;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonExample extends JFrame implements ActionListener {

    // JButton and JLabel
    JButton button;
    JLabel label;

    public JButtonExample() {
        // Create a new frame
        setTitle("JButton Example");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 30);

        // Create a label to display the action
        label = new JLabel("Button not clicked");
        label.setBounds(50, 100, 150, 30);

        // Add action listener to the button
        button.addActionListener(this);

        // Add button and label to the frame
        add(button);
        add(label);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Change the text of the label when the button is clicked
        label.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new JButtonExample();
    }
}

