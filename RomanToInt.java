import java.beans.PropertyEditorManager;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ROman numeral");
        String s = input.next();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int answer = 0;
        int num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (num * 2 < answer) {
                answer -= num;
            } else {
                answer += num;
            }
        }
        return answer;
    }
}
