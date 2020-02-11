import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        String str;
        int x;
        double y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        str = sc.nextLine();
        y = Double.parseDouble(str);
        x = (int)y;
        System.out.println("String: " + str);
        System.out.println("Integer: " + x);
        System.out.println("Double: " + y);
    }
}
