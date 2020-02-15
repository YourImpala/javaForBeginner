
import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int len;
        do {
            System.out.println("Введите бинарное число:");
            s = sc.nextLine();
            len = s.length();
        }while(!s.matches("[0-1]+") & len > 32);
        sc.close();

        int result = 0;
        int radix = 2;
        int i = 0;
        int digit;
        while (i < len) {
            digit = Character.getNumericValue(s.charAt(i++));
            result *= radix;
            result -= digit;
        }
        System.out.println(s + " --> в десятичной системе: " +  -result );
    }
}
