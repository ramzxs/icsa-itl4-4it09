package oop;

import java.util.Scanner;

// Class Declaration
public class Intro { // extends java.lang.Object (Mother Class) [Auto]
    // Members

    // Fields (Class Variables)
    int fieldVar = 1;

    // Constructors
    // Methods to create your object
    // Default Constructor [Auto]
    // public Intro() {
    // }

    // Methods

    public static void main(String[] args) {
        System.out.println("JAVA OOP INTRO");

        Intro intro; // Initialization / instantiation
        intro = new Intro(); // intro is now an instance of class Intro via the keyword new
        intro.fieldVar = 2; // Class access operator .
        intro.doSomething();
        System.out.println("Convert to String: " + intro.toString()); // Memory Address

        // External Libraries
        // Class variableName;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = kb.nextLine();
        System.out.print("Enter age: ");
        int age = kb.nextInt();
        System.out.println("Hello, " + name + " (" + age + " years old)!");

        System.out.println("Pi: " + java.lang.Math.PI);

        kb.close();
    }

    void doSomething() {
        System.out.println("Do Something");
    }

    // Inherited methods
    @Override
    public String toString() {
        return "Intro (" + fieldVar + ")";
    }


    // Longest Possible Method
    public static String method1(int param1, float param2) throws Exception {
        return "";
    }
}
