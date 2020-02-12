import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.println("Введите первое число");
        x = in.nextInt();
        System.out.println("Введите второе число");
        y = in.nextInt();
        System.out.println("Введите третье число");
        z = in.nextInt();
        in.close();

        double avg = (x + y + z) / 3.0;
        System.out.println("Среднеарифмитическое = " + avg);
        double result = avg / 2;
        System.out.println("Деление средниарифмитического на 2 без остатка = " + result);
        if(result > 3 )
            System.out.println("Программа выполнена корректно");
    }
}