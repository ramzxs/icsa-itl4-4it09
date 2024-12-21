package tasks;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class CounterAWTApp extends Frame {
    int val = 0;

    TextField counter = new TextField("0");
    Button count = new Button("Count");

    public static void main(String[] args) {
        new CounterAWTApp();
    }

    CounterAWTApp() {
        this.setTitle("Counter AWT App");
        this.setSize(400, 400);
        this.setResizable(false);
        // Exit on Close
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Text Field
        counter.setEditable(false);
        Font font1 = new Font("Arial", NORMAL, 64);
        counter.setFont(font1);

        // Button
        Font font2 = new Font("Arial", NORMAL, 32);
        count.setFont(font2);
        count.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.setText(String.valueOf(++val));
            }
        });

        // Layout
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(counter, BorderLayout.NORTH);
        this.add(count, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
