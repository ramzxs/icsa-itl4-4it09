package tasks;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CalculatorSwingApp extends JFrame {
    JLabel lblExpression = new JLabel("Expression");
    JLabel lblResult = new JLabel("Result");
    JButton[] btnNumbers = new JButton[10];
    JButton[] btnOperators = new JButton[7];

    public static void main(String[] args) {
        new CalculatorSwingApp();
    }

    public CalculatorSwingApp() {
        setTitle("Calculator Swing App");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Numbers:   0 1 2 3 4 5 6 7 8 9
        // Operators: =    + - * / %    C
        // Example:   150 + 10% --> 150 + 15 = --> 165

        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = (float) 1/4;
        gbc.weighty = (float) 1/7;

        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(lblExpression, gbc);

        gbc.gridheight = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(lblResult, gbc);

        gbc.gridwidth = 1;
        gbc.gridheight = 1;


        // NUMBERS

        btnNumbers[0] = new JButton("0");
        gbc.gridy = 6;
        gbc.gridx = 1;
        this.add(btnNumbers[0], gbc);

        btnNumbers[1] = new JButton("1");
        gbc.gridy = 5;
        gbc.gridx = 0;
        this.add(btnNumbers[1], gbc);

        btnNumbers[2] = new JButton("2");
        gbc.gridy = 5;
        gbc.gridx = 1;
        this.add(btnNumbers[2], gbc);

        btnNumbers[3] = new JButton("3");
        gbc.gridy = 5;
        gbc.gridx = 2;
        this.add(btnNumbers[3], gbc);

        
        btnNumbers[4] = new JButton("4");
        gbc.gridy = 4;
        gbc.gridx = 0;
        this.add(btnNumbers[4], gbc);

        btnNumbers[5] = new JButton("5");
        gbc.gridy = 4;
        gbc.gridx = 1;
        this.add(btnNumbers[5], gbc);

        btnNumbers[6] = new JButton("6");
        gbc.gridy = 4;
        gbc.gridx = 2;
        this.add(btnNumbers[6], gbc);


        btnNumbers[7] = new JButton("7");
        gbc.gridy = 3;
        gbc.gridx = 0;
        this.add(btnNumbers[7], gbc);

        btnNumbers[8] = new JButton("8");
        gbc.gridy = 3;
        gbc.gridx = 1;
        this.add(btnNumbers[8], gbc);

        btnNumbers[9] = new JButton("9");
        gbc.gridy = 3;
        gbc.gridx = 2;
        this.add(btnNumbers[9], gbc);

        // OPERATORS
        gbc.gridx = 3;

        btnOperators[0] = new JButton("=");
        gbc.gridy = 6;
        this.add(btnOperators[0], gbc);

        btnOperators[1] = new JButton("+");
        gbc.gridy = 5;
        this.add(btnOperators[1], gbc);

        btnOperators[2] = new JButton("-");
        gbc.gridy = 4;
        this.add(btnOperators[2], gbc);

        btnOperators[3] = new JButton("*");
        gbc.gridy = 3;
        this.add(btnOperators[3], gbc);

        btnOperators[4] = new JButton("/");
        gbc.gridy = 2;
        this.add(btnOperators[4], gbc);

        btnOperators[5] = new JButton("%");
        gbc.gridy = 1;
        this.add(btnOperators[5], gbc);

        btnOperators[6] = new JButton("C");
        gbc.gridy = 0;
        this.add(btnOperators[6], gbc);

        setVisible(true);
    }
}
