package gui;

import java.awt.Label;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;

public class Draw extends JFrame {
    Label lblXY = new Label("Test");

    public static void main(String[] args) {
        new Draw();
    }

    public Draw() {
        this.setTitle("Draw");
        this.setSize(400, 400);

        this.add(lblXY);

        this.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // super.mouseClicked(e);
                lblXY.setText("X: " + e.getX() + "\nY: " + e.getY());
            }
        });

        this.setVisible(true);
    }
}
