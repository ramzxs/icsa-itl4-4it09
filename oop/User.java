package oop;

public class User { // extends java.lang.Object
    // MEMBERS

    // Fields
    String username;
    String password;
    String account;

    // Constructors
    User() {
        username = "";
        password = "";
        account = "0000";
    }

    // Methods
    public String getAccount() throws Exception { // Error Handling
        if (account.equals("")) {
            throw new Exception();
        } else {
            return account;
        }
    }

    // toString() 
}
