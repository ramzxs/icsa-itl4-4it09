package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingApp extends JFrame {
    public static void main(String[] args) {
        new SwingApp();
    }

    public SwingApp() {
        setTitle("Swing App");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btnExit = new JButton("Click Me");

        this.add(btnExit);

        
        setVisible(true);
    }
}
