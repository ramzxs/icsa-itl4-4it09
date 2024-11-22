package basics;

public class Methods {
    // Class Members / Global variables
    int a = 3;

    public static void main(String[] args) {
        System.out.println("JAVA FUNCTIONS");

        // Variable scoping
        int a = 1;

        // Method call
        sayHi(a);

        Methods m = new Methods();
        System.out.println(m.a);

        System.out.println("Quotient: " + getQuotient(15, 4));
    }

    // Method Declaration
    // Method/Function Signature
    // modifiers returnDataType methodName(parametersList) { body }
    static void sayHi(int passedVariable) {
        System.out.println("Hi!");

        int a = 2; // Local variables
        System.out.println(passedVariable);
        System.out.println(a);

        Methods m = new Methods();
        System.out.println(m.a);
    }

    static float getQuotient(int a, int b) {
        return ((float) a / b); // Type Casting
    }
}
