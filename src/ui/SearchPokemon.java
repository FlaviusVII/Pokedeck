package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SearchPokemon extends MainInterface {

    private JPanel panel;

    public SearchPokemon() {

        this.panel = new JPanel(new FlowLayout());

        JLabel searchName = new JLabel("Search by Name");
        JLabel searchNumber = new JLabel("Search by Number");

        JTextField inputName = new JTextField();
        JTextField inputNumber = new JTextField();
        inputName.addActionListener(this);
        inputName.setPreferredSize(new Dimension(300, 20));
        inputNumber.setPreferredSize(new Dimension(300, 20));

        this.panel.add(searchName);
        this.panel.add(inputName);
        this.panel.add(searchNumber);
        this.panel.add(inputNumber);
        super.updateFrame("Search Pokemon", 500, 100, this.panel);
    }

    public void actionPerformed(ActionEvent e) {
        new Index();
    }
}
