package oop;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.print("Main");

        /* OOP, Non-Procedural Way
        User.login();
        User.authenticate();
        Main.loadScreen(); */

        // Object Declaration, Instantiate
        User user;
        user = new User();
        user.username = "root";
        user.password = "admin";
        user.account = "0001";
        System.out.println(user.toString());

        // OOP CONCEPTS

        // INHERITANCE
        // Superclass -> Subclass
        // Borrow features from other classes
        // Improve existing libraries
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "1234";

        // ENCAPSULATION
        // Protect internal data
        // Implement additional logic
        UserSession userSession = new UserSession();
        userSession.setUser(new User());
        userSession.getStart();
   }
}