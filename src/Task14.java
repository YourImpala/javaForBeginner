import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        String str = sc.nextLine();
        sc.close();

        double y = Double.parseDouble(str);
        int x = (int)y;
        System.out.println("String: " + str);
        System.out.println("Integer: " + x);
        System.out.println("Double: " + y);
    }
}
