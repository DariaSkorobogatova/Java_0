package Homework_7.WindowElements.InfoPanelElements;

import javax.swing.*;
import java.awt.*;

public class LogsArea extends JPanel {

    private JTextArea log;
    private JScrollPane scroll;

    public LogsArea() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        formLogsArea();
    }

    private void formLogsArea() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy = 0;
        constraints.ipady = 45;
        add(new JLabel("Logs info", SwingConstants.CENTER), constraints);
        log = new JTextArea();
        scroll = new JScrollPane(log);
        constraints.gridy = 1;
        constraints.ipady = 100;
        add(scroll, constraints);
    }
}

