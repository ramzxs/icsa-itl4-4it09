package basics; // Folder name

public class Basics { // File name
    public static void main(String[] args) { // Required entry point of the app
        System.out.println("JAVA BASICS");

        // 1. COMMENTS AND STATEMENTS

        // 2. VARIABLES & DATA TYPES
        
        int a;   // Variable Declaration: dataType variableName;
        a = 1;   // Assignment statement
        System.out.println(a); // "1\n"
        a = '2'; // int and char special relationship 
        // a = "String"; // Java is a Strictly-Typed PL
        System.out.println(a); // "2\n"; "50\n" (character 2 is 50 in decimal)

        // Native/Primitive Data Types
        boolean b = true; // Boolean 'true' or 'false' values
        byte c = 125;
        char d = 'X';
        short e = 128;
        int f = 123245;
        long g = 15454544484L; // l or L
        float h = 1.254645F; // f or F
        double i = 1.1254151515151515; // d or D
        
        // Complex Objects
        String j = ""; // null


        // 3. OPERATORS & EXPRESSIONS
        // Assignment Operator: =
        // Grouping: ( )
        // Numerical: + - * / % (modulo or remainder)
        int i1 = 10;
        int i2 = 20;
        int i3 = i1 + i2 * 10; // MDAS Rule: 10 + (20 * 10) not (10 + 20) * 10
        System.out.println("i3 = " + i3);

        // CHALLENGE
        // Area of a rectangle
        // Inputs: Length, Width
        int l = 10;
        int w = 15;
        int A = l * w; // case-sensitive; a is different from A
        System.out.println("l: " + l);
        System.out.println("w: " + w);
        System.out.println("A: " + A);
        
        // CHALLENGE
        // Mathematical Function
        // y = 2x^2 + 4x + 8
        int x = -30; // User Input or from an external/other Process
        int y = (2 * (x * x)) + (4 * x) + 8; // Expression in Java
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        // Division
        System.out.println((float) 10 / 3); // Type Casting

        // Modulo / Remainder Operator
        System.out.println("Remainder: " + 10 % 3); // 10 / 3 = 3 remainder 1

        // CHALLENGE
        // Celsius to Fahrenheit
        int celsius = 24;
        double fahrenheit = (celsius * ((double) 9 / 5)) + 35; // (24°C × 9/5) + 32 = 75.2°F
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        // Logical/Conditional:  == != < <= > >=
        //                       && (AND)  || (OR)
        System.out.println(1 == 2);
        System.out.println(('A' == 'A')); // char to char only

        System.out.println(true && true);            // AND: true if both are true
        System.out.println(false && true);
        System.out.println(false || true);           // OR: true if at least one is true
        System.out.println(true || false || true);
        System.out.println(false || (true && true));

        // Unary Operator: ++ (Increment, add 1)
        //                 -- (Decrement, minus 1)
        int cntr = 1;
        System.out.println(cntr--); // retrieve (1), decrement (0)
        System.out.println(cntr);
        System.out.println(++cntr); // increment (1), retrieve (1)
        System.out.println(cntr);

        // Tertiary Operator: ?:
        // (condition) ? truePart : falsePart 
        System.out.println((1 > 10) ? "Yes" : "No");

        // Operators:
        // Bitwise ^ (OR) << >> (Shift) (Operates 0s and 1s)
        // 12 >> 2 ==> 1100 >> 2 ==> 0011 ==> 3
    }
}
