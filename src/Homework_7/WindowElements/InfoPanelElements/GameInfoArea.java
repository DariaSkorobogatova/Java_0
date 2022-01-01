package Homework_7.WindowElements.InfoPanelElements;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {

    public GameInfoArea() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        formGameInfoArea();
        addElements();
    }

    private void formGameInfoArea() {
        setLayout(new GridLayout(4,1));
    }

    private void addElements() {
        add(new JLabel("Game info", SwingConstants.CENTER));
        add(new JLabel(" map: ", SwingConstants.LEFT));
        add(new JLabel(" level: ", SwingConstants.LEFT));
        add(new JLabel(" count traps: ", SwingConstants.LEFT));
    }
}
