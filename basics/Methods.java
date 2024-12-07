package basics;

public class Methods {
    public static void main(String[] args) {
        System.out.println("JAVA METHODS/FUNCTIONS");

        // Function call
        doSomething();

        // Variable scoping
        int a = 1;
        sayHi(a);
        System.out.println("Main's a: " + a);


        float answer = getQuotient(10, 3); // 3.33
        System.out.println("Quotient: " + answer);
    }

    // Method Declaration
    // Method/Function Signature
    // modifiers returnDataType methodName(parametersList) { body }
    private static void doSomething() {
        System.out.println("Do Something");
    }

    // Parameters
    static void sayHi(int param1) {
        System.out.println("Hi! Parameter: " + param1);

        int a = 2; // Local variables
        System.out.println("sayHi's a: " + a);
    }

    // Return Value
    static float getQuotient(int a, int b) {
        float q = (float) a / b; // 10 / 3 = 3 (int only) but "(float) 10 / 3" = 3.33 (Type Casting)
        return q;
    }
}