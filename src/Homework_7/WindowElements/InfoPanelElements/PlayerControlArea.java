package Homework_7.WindowElements.InfoPanelElements;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {

    private JButton up;
    private JButton down;
    private JButton left;
    private JButton right;

    public PlayerControlArea() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        createPlayerControlAreaElements();
        formPlayerControlArea();

    }

    private void formPlayerControlArea() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.ipady = 30;
        add(new JLabel("Player controls", SwingConstants.HORIZONTAL), constraints);
        constraints.ipady = 15;
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        add(up, constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        add(left, constraints);
        constraints.gridx = 1;
        add(down, constraints);
        constraints.gridx = 2;
        add(right, constraints);

    }

    private void createPlayerControlAreaElements() {
        up = new JButton("UP");
        down = new JButton("DOWN");
        left = new JButton("LEFT");
        right = new JButton("RIGHT");
    }
}

