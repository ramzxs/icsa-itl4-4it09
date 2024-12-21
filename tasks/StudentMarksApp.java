package tasks;

public class StudentMarksApp {
    public static void main(String[] args) {
        // CONSOLE APP

        // String[] names     = { "", "", "", "" };
        // int[] mathMarks    = {  0,  0,  0,  0 };
        // int[] physicsMarks = {  0,  0,  0,  0 };

        // Using Array of Objects
        StudentMark[] studentMarks = new StudentMark[3];

        studentMarks[0] = new StudentMark(); // { "", 0, 0 }
        studentMarks[0].student = "Jane";
        studentMarks[0].math = 40;
        studentMarks[0].physics = 20;

        studentMarks[1] = new StudentMark("Jon", 70, 60); // { "Jon", 70, 60 }
        studentMarks[2] = new StudentMark("Stewart", 80, 75);


        System.out.println("STUDENT         MATH       PHYSICS");

        for (int i = 0; i < studentMarks.length; i++) {
            System.out.format("%-15s %-10d %d%n",
                studentMarks[i].student, studentMarks[i].math, studentMarks[i].physics);
        }
    }
}
