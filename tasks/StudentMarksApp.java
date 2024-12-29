package tasks;

public class StudentMarksApp {
    public static void main(String[] args) {
        // CONSOLE APP

        // Three 1-Dimensional Arrays
        // String[] names     = { "Jane", "Jon", "Stewart" };
        // int[] mathMarks    = {     40,    70,        80 };
        // int[] physicsMarks = {     20,    60,        75 };

        // Using Array of Objects
        StudentMark[] studentMarks = new StudentMark[3]; // { Object1, Object2, Object3 }

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
