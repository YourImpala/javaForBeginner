import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько элементов будет в массиве?");
        int length = sc.nextInt();
        double[]nums = new double[length];

        System.out.println("Наполните массив числами");
        for (int i = 0; i < length; i++)
            nums[i] = sc.nextDouble();

        //Insertion Sort
        for (int i = 1; i < length; i++) {
            for (int j = i;j > 0 && nums[j - 1] > nums[j] ; j--) {
                double tmp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = tmp;
            }
        }
        System.out.println("Отсортированный массив: ");
        for(double num: nums)
            System.out.println(num);

    }
}
