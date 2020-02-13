import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) throws Exception {
        String path = "src/files/textEx18";
        int lines = lineCounter(path);

        System.out.println("Кол-во строк для перезаписи: " + lines);
        if(lines == 0) {
            System.out.println("Файл пустой. Программа завершена");
            return;
        }

        textRewriter(path, lines);
        System.out.println("Файл перезаписан.");
    }

    private static int lineCounter(String path) throws Exception{
        FileReader fr = new FileReader(path);
        Scanner sc = new Scanner(fr);
        int count = 0;
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
            count++;
        }
        fr.close();
        return count;
    }

    private static void textRewriter(String path, int amount) throws Exception{
        FileWriter fw = new FileWriter(path);
        Scanner sc = new Scanner(System.in);
        String line;

        while (amount > 0){
            line = sc.nextLine();
            fw.write(line + "\n");
            amount--;
        }
        fw.close();
    }
}
