import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Type number and press Enter");

        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        System.out.println(num + " X 1 = " + num);
        System.out.println(num + " X 2 = " + num * 2);
        System.out.println(num + " X 3 = " + num * 3);
        System.out.println(num + " X 4 = " + num * 4);
        System.out.println(num + " X 5 = " + num * 5);
        System.out.println(num + " X 6 = " + num * 6);
        System.out.println(num + " X 7 = " + num * 7);
        System.out.println(num + " X 8 = " + num * 8);
        System.out.println(num + " X 9 = " + num * 9);
        System.out.println(num + " X 10 = " + num * 10);
    }
}