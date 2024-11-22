package basics;

public class Basics {
    public static void main(String[] args) {
        System.out.print("JAVA BASICS\n"); // \n = New Line

        /* MULTI-
        LINE
        COMMENTS */ int a = 0;

        int b = 0; // Single Line Comment

        /* STATEMENTS */

        /**
         * VARIABLES, DATA TYPES
         */
        // Strictly-Typed Language
        // Should not start with a number, .
        String appName;               // Variable declaration
        String username = "root";     // Assignment Statement (= operator)
        char c = 'a';
        byte b2 = 127;
        int i = 1;
        float f = 1.23F;
        double d = 1.23454454;
        boolean bool = true; // false
        // void
        // null

        /**
         * EXPRESSIONS, OPERATORS 
         */
        // Grouping:   ( )
        // Numerical:  + - * / % (modulo or remainder)
        a = 1;
        b = 2;
        i = (a + b);
        int i1 = 10;
        int i2 = 4;
        int i3 = i1 % i2; // 10 % 4 = 2 remainder 2
        System.out.println(i3); // 1\n
        System.out.println("\t Tab Char");
        
        // Logical/Conditional:  == != < <= > >=
        //                       && (AND)  || (OR)
        System.out.println(1 == 2);
        System.out.println(('A' == 'A')); // char to char only
        
        System.out.println(true && true);            // All should be true
        System.out.println(false && true);
        System.out.println(false || true);
        System.out.println(true || false || true);   // At least one should be true
        System.out.println(false || (true && true)); // false || true ==> true

        // Unary Operator:     ++ --
        int cntr = 1;
        System.out.println(cntr--); // retrieve (1), decrement (0)
        System.out.println(++cntr); // increment (1), retrieve (1)

        // Tertiary Operator:  ?:
        System.out.println((1 > 10) ? "Yes" : "No");

        // CHALLENGE
        // f(x) = 9x^2 + 6x + 3
        int x = 2;
        int y = (9 * (x * x)) + (6 * x) + 3;
        System.out.println(y);
    }
}
