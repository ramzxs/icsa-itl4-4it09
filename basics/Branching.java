package basics;

public class Branching {
    public static void main(String[] args) {
        System.out.println("JAVA BRANCHING");

        // 1. if Statement
        char choice = 'Y';
        if (choice == 'Y') {
            System.out.println("You said yes.");
        }

        // 2. if-else Statement
        choice = 'N';
        if (choice == 'Y') {
            System.out.println("You said yes.");
        } else {
            System.out.println("You said no.");
        }

        // 3. if-else-if Statement
        int a = 101;
        if (a < 0) {
            System.out.println("Negative");
        } else if (a == 0) {
            System.out.println("Zero");
        } else if (a > 0 && a <= 100) { // true && true ==> true
            System.out.println("Positive (up to 100)");
        } else {
            System.out.println("Else (more than 100)");
        }

        // 4. switch Statement
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("First Set");
                // break;
            case 'B':
                System.out.println("Second Set");
                break;
            default:
                System.out.println("Others");
        }

        // CHALLENGE
        // Grading System
        // 0-50 Fail
        // 51-75 Pass
        // 76-90 Merit
        // 91-100 Distinction
        int grade = 100;
        String level = "";
        if (grade >= 0 && grade <= 50) {
            level = "Fail";
        } else if (grade >= 51 && grade <= 75) {
            level = "Pass";
        } else if (grade >= 76 && grade <= 90) {
            level = "Merit";
        } else if (grade >= 91 && grade <= 100) {
            level = "Distinction";
        } else {
            level = "Invalid";
        }
        System.out.println("Grade: " + grade);
        System.out.println("Level: " + level);


        // CHALLENGE
        /*
         * Do you want to purchase a phone? [Y or N]
         * If Y:
         * Select a phone:
         * 1. Android
         * 2. iOS
         * 3. Harmony OS
         * 
         * If 1:
         * Select a brand:
         * 1. Samsung
         * 2. Vivo
         * If 2:
         * Select a model:
         * 1. iPhone 16
         * 2. iPhone 15
         * 3. iPhone 14
         * If 3:
         * Select a model:
         * 1. Huawei MatePad
         * 2. Pura 70 Ultra
         * If N:
         * Good bye!
         */

        
        System.out.println("Do you want to purchase a phone? [Y or N]");
        char choice1 = 'Y';
        if (choice1 == 'Y') {
            System.out.println("Select a phone:\r\n" + //
                    "\t1. Android\r\n" + //
                    "\t2. iOS\r\n" + //
                    "\t3. Harmony OS");
            char choice2 = '2';

            switch (choice2) {
                case '1':
                    System.out.println("Select a brand:\r\n" + //
                            "\t1. Samsung\r\n" + //
                            "\t2. Vivo");
                    break;

                case '2':
                    System.out.println("Select a model:\r\n" + //
                            "\t1. iPhone 16\r\n" + //
                            "\t2. iPhone 15\r\n" + //
                            "\t3. iPhone 14");
                    char choice3 = '2';

                    switch (choice3) {
                        case '1':
                            System.out.println("You have selected: iPhone 16");
                            break;

                        case '2':
                            System.out.println("You have selected: iPhone 15");
                            break;

                        case '3':
                            System.out.println("You have selected: iPhone 14");
                            break;

                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;

                case '3':
                    System.out.println("Select a model:\r\n" + //
                            "\t1. Pura 70 Ultra");
                    break;

                default:
                    System.out.println("Invalid");
                    break;
            }

        } else if (choice1 == 'N') {
            System.out.println("Good bye!");
        } else {
            System.out.println("Invalid");
        }
    }
}
