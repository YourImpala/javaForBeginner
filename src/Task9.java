import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length;

        System.out.println("Введите кол-во вводимых чисел:");
        do{
            length = in.nextInt();
        }while(length <= 0);

        int [] nums = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите число № " + (i + 1)  + " :");
            nums[i] = in.nextInt();
        }
        System.out.println("Значения массива умноженные на 2:");
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i] * 2);
        }
    }

}
