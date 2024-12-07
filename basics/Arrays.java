package basics;

/* DATA STRUCTURES AND ALGORITHMS */

public class Arrays {
    public static void main(String[] args) {
        System.out.println("JAVA ARRAYS");

        // Fixed set/list of similar / same data type items
        int[] nums;
        nums = new int[6]; // Initialize / Dimension
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 55;
        System.out.println("Length: " + nums.length);
        System.out.println("Last Item: " + nums[5]);


        char[] chars1 = { 'a', 'b', 'c' }; // 0 1 2
        System.out.println("Length: " + chars1.length);
        System.out.println("Second Item: " + chars1[1]);
        chars1[1] = 'B';
        System.out.println("Second Item: " + chars1[1]);


        char[] chars2 = new char[ chars1.length + 1 ]; // 3 + 1
        for (int i = 0; i < chars1.length; i++) {
            chars2[i] = chars1[i];
        } // alphabet2 = { 'a', 'B', 'c', null }
        System.out.println("Third Element: " + chars2[2]);
        System.out.println("Fourth Element: " + chars2[3]);
        System.out.println("Fourth Element: " + (chars2[3] = 'D')); // assign 'D' to the variable, then retrieve value


        System.out.println("CAESAR'S CIPHER");
        // EXAMPLE:
        // Plain Message:      ATTACK
        // Cipher:             +5
        // Encrypted Message:  FYYFHP
        // CHALLENGE
        // Alphabet:    { 'A' ... 'Z', '0' ... '9' }
        // Cipher:      +3
        // Plaint Text: "APPLE"
        // Encrypted:   "DSSOH"
        String plainText = "APPLE123";
        int cipher = 3;

        System.out.println("Plain Text: " + plainText);
        System.out.println("Cipher: " + cipher);

        char[] alphabet = {
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            '0','1','2','3','4','5','6','7','8','9'
        };

        char[] charsPlainText = plainText.toCharArray();            // {'A','P','P','L','E','1','2','3'}
        char[] charsEncrypted = new char[ charsPlainText.length ];  // {null,null,null,null,null,null,null,null}

        // PSEUDOCODE
        // find the plain character from the alphabet
        //     get the character cipher-times to the right
        //         save the value
        for (int i = 0; i < charsPlainText.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == charsPlainText[i]) {
                    // System.out.println("Index of " + charsPlainText[i] + ": " + j);
                    // System.out.println("Index + Cipher: " + (j + cipher));
                    // System.out.println("New Character: " + alphabet[j + cipher]);
                    charsEncrypted[i] = alphabet[(j + cipher) % alphabet.length];
                    // 9 = 36th Char = Index 35
                    // 35 + 1 = 36 % 36 = 1 r 0
                    break;
                }
            }
        }
        System.out.print("Encrypted: ");
        for (int i = 0; i < charsEncrypted.length; i++) {
            System.out.print(charsEncrypted[i]);
        }
        System.out.println();


        System.out.println("Encrypted: " + caesarCipher("ATTACKFRONT", 5));
    }


    public static String caesarCipher(String plainText, int cipher) {
        System.out.println("CEASAR'S CIPHER (METHOD)");
        System.out.println("Plain Text: " + plainText);
        System.out.println("Cipher: " + cipher);

        char[] allowedchars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        char[] plains = plainText.toCharArray();
        String enc = "";

        for (int i = 0; i < plains.length; i++) {
            for (int a = 0; a < allowedchars.length; a++) {
                if (plains[i] == allowedchars[a]) {
                    enc += allowedchars[(a + cipher) % allowedchars.length];
                }
            }
        }
        
        return enc;
    }
}
