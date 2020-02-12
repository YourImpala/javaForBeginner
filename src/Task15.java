import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько элементов будет в массиве?");
        int length = sc.nextInt();
        double[]nums = new double[length];

        System.out.println("Наполните массив числами");
        for (int i = 0; i < length; i++)
            nums[i] = sc.nextDouble();

        //bubble sort
        for(int k = length - 1; k > 0; k--) {
            for(int j = 0; j < k; j++) {
                if(nums[j] > nums[j + 1]) {
                    double tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }

        System.out.println("Отсортированный массив: ");
        for(double num: nums)
            System.out.println(num);

    }
}
