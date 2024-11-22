package basics;

public class Branching {
    public static void main(String[] args) {
        System.out.println("JAVA BRANCHING");

        char choice = 'Y';

        /* if Statement */
        if (choice == 'Y') {
            System.out.println("You said yes.");
        }

        /* if-else Statement */
        if (choice == 'Y') {
            System.out.println("You said yes.");
        } else {
            System.out.println("You said no.");
        }

        /* if-else-if Statement */
        /*
         * MENUS
         * A = Software
         * B = Hardware
         * C = Network
         */
        choice = 'B';
        if (choice == 'A') {
            System.out.println("Software");
        } else if (choice == 'B') {
            System.out.println("Hardware");
        } else if (choice == 'C') {
            System.out.println("Network");
        } else {
            System.out.println("Invalid");
        }

        /* switch Statement */
        // Do not use Strings, use chars only
        choice = 'A';
        switch (choice) {
            case 'A':
                System.out.println("Software");
                // break;
            case 'B':
                System.out.println("Hardware");
                break;
            case 'C':
                System.out.println("Network");
                break;

            default:
                break;
        }

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
         * 1. Pura 70 Ultra
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
