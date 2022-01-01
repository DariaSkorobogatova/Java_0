package Homework_7.WindowElements;

import Homework_7.WindowElements.InfoPanelElements.*;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    private PlayerControlArea playerControlArea;
    private LogsArea logsArea;


    public InfoPanel() {
        formInfoPanel();
        createInfoPanelElements();
        addElements();
    }

    private void formInfoPanel() {
        setBackground(new Color(236, 163, 107));
        setLayout(new GridLayout(5,1));
    }

    private void createInfoPanelElements() {
        gameControlArea = new GameControlArea();
        gameInfoArea = new GameInfoArea();
        playerInfoArea = new PlayerInfoArea();
        playerControlArea = new PlayerControlArea();
        logsArea = new LogsArea();
    }

    private void addElements() {
        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(logsArea);
    }

}
