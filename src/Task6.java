import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();
        System.out.println("Введите третье число");
        int z = in.nextInt();
        in.close();

        double avg = (x + y + z) / 3.0;
        System.out.println("Среднеарифмитическое = " + avg);
        double result = avg / 2;
        System.out.println("Деление средниарифмитического на 2 без остатка = " + result);
        if(result > 3 )
            System.out.println("Программа выполнена корректно");
    }
}