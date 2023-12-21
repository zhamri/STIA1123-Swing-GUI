package my.zhamri;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample extends JFrame implements ActionListener {

    // Menu components
    JMenuBar menuBar;
    JMenu fileMenu, editMenu;
    JMenuItem openItem, saveItem, exitItem, copyItem, pasteItem;

    public MenuExample() {
        // Create a new frame
        setTitle("Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar
        menuBar = new JMenuBar();

        // Create the "File" menu with menu items
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // adds a separator line
        fileMenu.add(exitItem);

        // Create the "Edit" menu with menu items
        editMenu = new JMenu("Edit");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add action listeners to the menu items
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for this frame
        setJMenuBar(menuBar);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) e.getSource();
        // Display a simple message dialog box with the menu item text
        JOptionPane.showMessageDialog(this, "You selected: " + source.getText());
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}

