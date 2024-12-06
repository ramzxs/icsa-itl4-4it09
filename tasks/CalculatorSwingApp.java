package tasks;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class CalculatorSwingApp extends JFrame {
    JLabel lblExpression = new JLabel("Expression   ");
    JLabel lblResult = new JLabel("Result   ");
    JButton[] btnNumbers = new JButton[10];
    JButton[] btnOperators = new JButton[7];

    public static void main(String[] args) {
        new CalculatorSwingApp();
    }

    public CalculatorSwingApp() {
        this.setTitle("Calculator Swing App");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Numbers:   0 1 2 3 4 5 6 7 8 9
        // Operators: =    + - * / %    C
        // Example:   150 + 10% --> 150 + 15 = --> 165

        this.setLayout(new GridBagLayout());
        Font font = new Font("Arial", Font.PLAIN, 16);
        this.setFont(font);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = (float) 1/4;
        gbc.weighty = (float) 1/7;


        // DISPLAY
        Font font1 = new Font("Arial", Font.PLAIN, 16);
        lblExpression.setFont(font1);
        lblExpression.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(lblExpression, gbc);

        Font font2 = new Font("Arial", Font.BOLD, 32);
        lblResult.setFont(font2);
        lblResult.setHorizontalAlignment(SwingConstants.RIGHT);
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

        ActionListener actionListenerNumbers = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processNumber(e.getActionCommand());
            }
        };

        for (int i = 0; i < btnNumbers.length; i++) {
            btnNumbers[i].setActionCommand(i + "");
            btnNumbers[i].addActionListener(actionListenerNumbers);
            btnNumbers[i].setFont(font);
        }


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


        ActionListener actionListenerOperators = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processOperator(e.getActionCommand());
            }
        };

        for (int i = 0; i < btnOperators.length; i++) {
            btnOperators[i].setActionCommand(btnOperators[i].getText());
            btnOperators[i].addActionListener(actionListenerOperators);
            btnOperators[i].setFont(font);
        }


        // UI
        this.setVisible(true);
    }


    // LOGIC

    String termLeft = "", termRight = ""; 
    String operatorPrevious = "", operatorCurrent = "";

    void processNumber(String n) {
        System.out.println("Number: " + n);
    }

    void processOperator(String op) {
        System.out.println("Operator: " + op);
    }
}
