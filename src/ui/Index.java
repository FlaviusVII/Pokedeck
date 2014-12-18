package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sebastienserrano
 */
public class Index extends MainInterface{
    private JPanel panel;
    
    public Index(){
        this.panel = new JPanel(new FlowLayout());
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        this.panel.add(searchButton);
        super.updateFrame("Pokedeck", 500, 100, this.panel);
    }
    public void actionPerformed(ActionEvent e) {
        new SearchPokemon();
    }
}
