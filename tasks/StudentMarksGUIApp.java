package tasks;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class StudentMarksGUIApp extends JFrame {
    public static void main(String[] args) {
        new StudentMarksGUIApp();
    }

    public StudentMarksGUIApp() {
        this.setTitle("STUDENT MARKS GUI APP");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // Using Array of Objects
        StudentMark[] studentMarks = new StudentMark[3];
        studentMarks[0] = new StudentMark("Jane", 40, 20);
        studentMarks[1] = new StudentMark("Jon", 70, 60);
        studentMarks[2] = new StudentMark("Stewart", 80, 75);

        // Column Names
        String[] columns = { "STUDENT", "MATH", "PHYSICS" };

        // Data to be displayed in the JTable
        String[][] data = new String[studentMarks.length][3];
        // data = [
        //   0 => [ 0 => "",  1 => "",  2 => "" ],
        //   1 => [ 0 => "",  1 => "",  2 => "" ],
        //   2 => [ 0 => "",  1 => "",  2 => "" ],
        // ]

        for (int i = 0; i < studentMarks.length; i++) {
            data[i] = new String[3]; // data[2] = [ "", "", "" ]
            data[i][0] = studentMarks[i].student;
            data[i][1] = studentMarks[i].math + "";
            data[i][2] = studentMarks[i].physics + "";
        }

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        this.add(scrollPane);
        this.setVisible(true);
    }
}
