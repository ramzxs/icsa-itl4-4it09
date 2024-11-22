package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* Abstract Windowing Toolkit */
public class AWTApp extends Frame {
     public static void main(String[] args) {
        System.out.println("AWT App");

        new AWTApp();
     }

     public AWTApp() {
        setTitle("AWT App");
        setSize(800, 600);
        // setResizable(false);
        setVisible(true);
        // Close Button
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        /* CONFIGS */
        Font font = new Font("Arial", NORMAL, 32);
        this.setFont(font);

        /* CONTENT */
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        Label lblAppTitle = new Label("AWT APP");
        add(lblAppTitle);
     }
}
