import java.sql.SQLOutput;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с пробелами");
        String str = sc.nextLine();
        sc.close();

        System.out.println("Строка очищенная от пробелов: \n" + str.replace(" ",""));
    }
}
