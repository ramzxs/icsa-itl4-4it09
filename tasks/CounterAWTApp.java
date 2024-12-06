package tasks;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.border.Border;


public class CounterAWTApp extends Frame {
    public static void main(String[] args) {
        new CounterAWTApp();
    }

    CounterAWTApp() {
        this.setTitle("AWT App");
        this.setSize(400, 400);
        this.setResizable(false);
        // Exit on Close
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        TextField counter = new TextField("Counter");
        Font font1 = new Font("Arial", NORMAL, 64);
        counter.setFont(font1);
        this.add(counter, BorderLayout.NORTH);

        Button count = new Button("Count");
        Font font2 = new Font("Arial", NORMAL, 32);
        count.setFont(font2);
        this.add(count, BorderLayout.SOUTH);

        this.setVisible(true);
    }
}
