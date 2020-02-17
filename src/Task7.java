import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        final double X = 3;
        final double Y = 4.5;
        final double Z = -1;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число и нажмите enter");
        double number = in.nextDouble();
        in.close();

        if (number == X || number == Y || number == Z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");

    }
}
