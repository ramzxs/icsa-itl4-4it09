package basics;

public class Looping {
    public static void main(String[] args) {
        System.out.println("JAVA LOOPING");

        // do-while
        System.out.println("do-while");
        int i = 1;
        do {
            System.out.println(i++);
        } while (i < 10);

        // while
        System.out.println("while");
        i = 11;
        while (i < 10) {
            System.out.println(i++);
        }

        // for
        System.out.println("for");
        for (int j = 1; j < 10; j++) {
            System.out.println(j);
        }

        // CHALLENGE
        // Dimension of the Square: 7
        // ******* // counter == 1
        // * *
        // * *
        // * *
        // * *
        // * *
        // ******* // counter == dimension
        int dim = 7;

        // Using 1 loop
        for (int a = 1; a <= dim; a++) {
            if (a == 1 || a == dim) {
                System.out.println("*".repeat(dim));
            } else {
                System.out.println("*" + " ".repeat(dim - 2) + "*");
            }
        }

        // Using 2 loops
        System.out.println("Using 2 loops");
        for (int b = 1; b <= dim; b++) {
            for (int c = 1; c <= dim; c++) {
                if (b == 1 || b == dim) {
                    System.out.print("* ");
                } else {
                    if (c == 1 || c == dim) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(); // Same as print("\n")
        }
    }
}
