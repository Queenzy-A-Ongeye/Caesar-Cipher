import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean runProgram = true;

        while (runProgram) {

            System.out.println("Welcome to my Caesar Cipher");
            System.out.println("Enter encrypt to encrypt or decrypt to decrypt or exit to leave the app");
            String choice = myScanner.nextLine();

            if (choice.equals("encrypt")) {
                System.out.println("Encrypt your message by entering it in the next line");
                String input = myScanner.nextLine();

                System.out.println("Enter a key");
                int key = myScanner.nextInt();
                Encrypt cipher = new Encrypt(input,key);
                String encrypted = Encrypt.encrypt(cipher);

                System.out.println("Encrypted message: " + encrypted);

            } else if (choice.equals("decrypt")) {
                System.out.println("To decrypt a message enter it below");
                String meme = myScanner.nextLine();

                System.out.println("Enter the key you used");
                int namba = myScanner.nextInt();
                Decrypt ceaser = new Decrypt(meme,namba);
                String decrypted = Decrypt.decrypt(ceaser);

                System.out.println("Decrypted message: " + decrypted);
            } else if (choice.equals("exit")) {
                runProgram = false;
            }
        }
    }
}