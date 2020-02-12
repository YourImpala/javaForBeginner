import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = sc.nextLine();
        sc.close();

        if (str1.equals(str2)) {
            System.out.println("Строки равны");
        } else if (str1.length() > str2.length()) {
            System.out.println("Длинная строка : "+ str1);
        } else {
            System.out.println("Длинная строка : " + str2);
        }

    }
}
