import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100; i += 2)
         System.out.print(i + (i < 99 ? ", " : "\n"));
        scanner.close();
     }
}
