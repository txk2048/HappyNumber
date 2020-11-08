package org.txk64;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final JSpinner numberSelector;

    private final JTextField isHappyDisplayField;

    private MainWindow() {
        // window setup code
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setSize(300, 300);
        setTitle("HappyNumber");

        // setup UI components
        numberSelector = new JSpinner(new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));
        numberSelector.addChangeListener(e -> updateIsHappyDisplayField());

        isHappyDisplayField = new JTextField();

        updateIsHappyDisplayField();

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 5, 5);
        constraints.weightx = 0.0d;
        constraints.weighty = 0.5d;
        add(new JLabel("Number: "), constraints);

        constraints.gridx = 1;
        constraints.insets = new Insets(10, 5, 5, 10);
        constraints.weightx = 1.0d;
        add(numberSelector, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets = new Insets(5, 10, 10, 5);
        constraints.weightx = 0.0d;
        add(new JLabel("Is happy?: "), constraints);

        constraints.gridx = 1;
        constraints.insets = new Insets(5, 5, 10, 10);
        constraints.weightx = 1.0d;
        add(isHappyDisplayField, constraints);
    }

    private void updateIsHappyDisplayField() {
        int n = (int)numberSelector.getValue();

        boolean happy = HappyNumber.isHappy(n);
        isHappyDisplayField.setText(
                happy ? "Happy" : "Not happy"
        );
    }

    public static void display() {
        MainWindow window = new MainWindow();
        window.setVisible(true);
    }
}
