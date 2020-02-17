import java.io.FileWriter;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("src/files/textEx17");
        Scanner sc = new Scanner(System.in);

        System.out.println("Наберите текст и нажмите 'enter', чтобы записать строку в файл.\nВведите 'stop', чтобы прекратить запись.");
        while (true){
            String line = sc.nextLine();
            if(line.equals("stop")) break;
            fw.write(line + "\n");
        }
        fw.close();
        sc.close();

        System.out.println("Запись в файл завершена");
    }
}
