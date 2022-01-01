package Homework_7;

import Homework_7.WindowElements.InfoPanel;
import Homework_7.WindowElements.MapPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private int windowWidth = 1024;
    private int windowHeight = 768;
    private int windowPositionX = 300;
    private int windowPositionY = 200;
    private String windowTitle = "Player VS Traps";
    private MapPanel mapPanel;
    private InfoPanel infoPanel;

    public MainWindow() {
        formWindow();
        createWindowElements();
        addElements();
    }

    private void createWindowElements() {
        mapPanel = new MapPanel();
        infoPanel = new InfoPanel();
    }

    private void formWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(windowWidth,windowHeight);
        setLocation(windowPositionX, windowPositionY);
        setTitle(windowTitle);
        setResizable(false);
        setVisible(true);
    }

    private void addElements() {
        add(mapPanel);
        add(infoPanel, BorderLayout.EAST);
    }

}
