import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите высоту матрицы");
        int height = sc.nextInt();
        System.out.println("Введите ширину матрицы");
        int width = sc.nextInt();

        int [][] matrix = new int[height][width];
        System.out.println("Создана матрица " + height + "X" + width);

        for (int k = 0; k < height; k++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Введите число в ячейку [" + k +"][" + j + "]");
                matrix[k][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Матрица наполнена полностью");
        Thread.sleep(2000);
        System.out.println("Выведена первая строка матрицы умноженная на 3");
        for(int i = 0; i < width; i++) {
            System.out.println(matrix[0][i] * 3);
        }

    }
}
