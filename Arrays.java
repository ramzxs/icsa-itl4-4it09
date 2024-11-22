/* DATA STRUCTURES AND ALGORITHMS */
public class Arrays {
    public static void main(String[] args) {
        System.out.println("JAVA ARRAYS");

        // Fixed set/list of similar / same data type items
        int[] nums;
        nums = new int[5]; // Initialize / Dimension
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 55;
        System.out.println(nums.length);

        char[] alphabet = { 'a', 'b', 'c' }; // 0 1 2
        System.out.println(alphabet.length);
        alphabet[1] = 'B';

        char[] alphabet2 = new char[alphabet.length + 1];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet2[i] = alphabet[i];
        } // { 'a', 'b', 'c'. '' }
        System.out.println(alphabet2[2]);
        System.out.println(alphabet2[3] = 'd'); // assign 'd' to the variable, then retrieve value

        
        System.out.println("CAESAR'S CIPHER");
        // CHALLENGE
        // CAESAR CIPHER (Encryption)
        // Alphabet: { 'A' ... 'Z', '0' ... '9' }
        // Cipher: 3
        // Plaint Text: "APPLE"
        // Encrypted: "DSSOH"
        char[] allowedchars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        int shift = 3;

        String plainText = "APPLE";

        System.out.print("Plain Text: ");
        char[] plainTextChars = plainText.toCharArray();
        for (int i = 0; i < plainTextChars.length; i++) {
            System.out.print(plainTextChars[i]);
        }
        System.out.println();

        String encrypted = "???";
        System.out.println("Encrypted: " + encrypted);
    }
}
