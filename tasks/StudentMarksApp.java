package tasks;

public class StudentMarksApp {
    public static void main(String[] args) {
        // CONSOLE APP

        // Using Array of Objects
        StudentMark[] studentMarks = new StudentMark[3];

        studentMarks[0] = new StudentMark();
        studentMarks[0].student = "Jane";
        studentMarks[0].math = 40000;
        studentMarks[0].physics = 20;

        studentMarks[1] = new StudentMark("Jon", 70, 60);
        studentMarks[2] = new StudentMark("Stewart", 80, 75);


        System.out.println("STUDENT         MATH       PHYSICS");

        for (int i = 0; i < studentMarks.length; i++) {
            System.out.format("%-15s %-10d %d%n",
                studentMarks[i].student, studentMarks[i].math, studentMarks[i].physics);
        }
    }
}
