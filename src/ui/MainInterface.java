package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import main.Menu;
import pokedeck.Pokedeck;

public class MainInterface implements ActionListener {

    protected JFrame frame;
    private Menu menu;

    public MainInterface() {
        this.frame = new JFrame("Pokedeck Interface");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.menu = new Menu(new Pokedeck());
    }

    public Index start() {
        return new Index();
    }

    public void SearchInterface() {
        JPanel search = new JPanel(new FlowLayout());

        JLabel searchName = new JLabel("Search by Name");
        JLabel searchNumber = new JLabel("Search by Number");

        JTextField inputName = new JTextField();
        JTextField inputNumber = new JTextField("searchByNumber");
        inputName.setName("searchByName");
        inputName.addActionListener(this);
        inputName.setPreferredSize(new Dimension(300, 20));
        inputNumber.setPreferredSize(new Dimension(300, 20));

        search.add(searchName);
        search.add(inputName);
        search.add(searchNumber);
        search.add(inputNumber);
        this.updateFrame("Search Pokemon", 500, 100, search);
    }

    public void index() {
        JPanel index = new JPanel(new FlowLayout());
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        index.add(searchButton);
        this.updateFrame("Pokedeck", 500, 100, index);
    }

    protected void updateFrame(String title, int width, int height, JPanel panel) {
        this.frame.add(panel);
        this.frame.setContentPane(panel);
        this.frame.setTitle(title);
        this.frame.setSize(width, height);
        this.frame.validate();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        switch (e.getActionCommand()) {
            case "Search":
                this.SearchInterface();
                break;
            case "d" :
                break;
        }
    }

}
