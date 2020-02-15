import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rate;
        String rubles;
        double result;

        do{
            System.out.println("Введите текущий курс $:");
            rate = sc.nextLine();
        }while(!isNumeric(rate));
        do{
            System.out.println("Введите кол-во рублей:");
            rubles = sc.nextLine();
        }while(!isNumeric(rubles));
        sc.close();

        result = Double.parseDouble(rubles) / Double.parseDouble(rate);

        System.out.println("Итого:");
        System.out.printf("%.2f$", result);

    }
    private static boolean isNumeric(String str) {
            try {
                Double.parseDouble(str);
                return true;
            } catch(NumberFormatException e) {
                return false;
            }
    }
}
