package Homework_7.WindowElements.InfoPanelElements;

import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {

    private JButton startGame;
    private JButton exitGame;

    public GameControlArea() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        formGameControlArea();
        createGameControlAreaElements();
        addElements();
    }

    private void formGameControlArea() {
        setLayout(new GridLayout(3,1));
    }

    private void createGameControlAreaElements() {
        startGame = new JButton("START GAME");
        exitGame = new JButton("EXIT GAME");
    }

    private void addElements() {
        add(new JLabel("Game controls menu", SwingConstants.CENTER));
        add(startGame);
        add(exitGame);
    }
}
