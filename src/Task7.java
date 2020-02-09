import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double X, Y, Z, number;
        X = 3;
        Y = 4.5;
        Z = -1;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число и нажмите enter");
        number = in.nextDouble();

       if (number == X || number == Y || number == Z)
           System.out.println("Данное значение имеется в константах");
       else
           System.out.println("Такой константы нет!");
       
    }
}
