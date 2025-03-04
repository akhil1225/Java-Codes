public class Decryptor {
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java Decryptor <encrypted_message> <nth_word_index> <key>");
            System.exit(1);
        }

        // Extract command line arguments
        String encryptedMessage = args[0];
        int nthWordIndex = Integer.parseInt(args[1]);
        String key = args[2];

        // Decrypt the message
        String decryptedMessage = decryptMessage(encryptedMessage, nthWordIndex, key);

        // Print the decrypted message
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    private static String decryptMessage(String encryptedMessage, int nthWordIndex, String key) {
        // Split the encrypted message into words
        String[] words = encryptedMessage.split("\\s+");

        // Check if nthWordIndex is a valid index
        if (nthWordIndex < 0 || nthWordIndex >= words.length) {
            System.out.println("Invalid nth word index.");
            System.exit(1);
        }

        // Replace the nth word with the key
        words[nthWordIndex] = key;

        // Join the words back to form the decrypted message
        return String.join(" ", words);
    }
}
