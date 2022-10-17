import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.next();
        System.out.println(pan(text));
    }

    public static boolean pan(String sentence) {
        for (int i = 0; i < 26; ++i) {
            char letter = (char) ('a' + i);
            if (sentence.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}

