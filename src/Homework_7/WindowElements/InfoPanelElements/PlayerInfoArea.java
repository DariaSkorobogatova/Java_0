package Homework_7.WindowElements.InfoPanelElements;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    public PlayerInfoArea() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        formPlayerControlArea();
        addElements();
    }

    private void formPlayerControlArea() {
        setLayout(new GridLayout(4,1));
    }

    private void addElements() {
        add(new JLabel("Player info", SwingConstants.CENTER));
        add(new JLabel(" name: ", SwingConstants.LEFT));
        add(new JLabel(" hp: ", SwingConstants.LEFT));
        add(new JLabel(" mana: ", SwingConstants.LEFT));
    }
}
