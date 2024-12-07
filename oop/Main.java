package oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("JAVA OOP MAIN");

        /* Procedural Programming
        step1();
        step2();
        processA();
        processB(); */

        /* Object-Oriented Programming
        User.login();
        User.authenticate();
        Main.loadScreen(); */

        // Object Declaration, Instantiate
        User user;
        user = new User();
        user.username = "root";
        user.password = "admin";
        user.account = "0001";
        System.out.println("User object converted to String: " + user.toString());

        // OOP CONCEPTS

        // INHERITANCE
        // Superclass -> Subclass
        // Borrow features from other classes
        // Improve existing libraries
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "1234";

        // ENCAPSULATION
        // Protect internal data
        // Implement policy / additional logic
        UserSession userSession = new UserSession();
        // userSession.user = null; (No Direct Access)
        userSession.setUser(new User());
        // System.out.println(userSession.start);
        userSession.getStart();

        // POLYMORPHISM
        // Super Class Instance <-- Subclass Instance
        Account account = new Account();
        // SavingsAccount sa2 = new SavingsAccount();
        // CheckingAccount ca = new CheckingAccount();
        account = new SavingsAccount();
        account = new CheckingAccount();



        // ABSTRACTION
        // Force custom implementation
        // Cannot instantiate
        // UserAuthenticate ua = new UserAuthenticate();
        // ua.login();
        // ua.logout();        
        UserAuthenticate ua = new UserAuthenticate() {
            @Override
            public void login() {
                // TODO
            }

            @Override
            public void logout() {
                // TODO
            }
        };
   }
}