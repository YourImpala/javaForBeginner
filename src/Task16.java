import java.io.FileReader;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) throws Exception{
        String path = "src/files/textEx16";

        FileReader fr = new FileReader(path);
        Scanner sc = new Scanner(fr);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        fr.close();
    }
}
