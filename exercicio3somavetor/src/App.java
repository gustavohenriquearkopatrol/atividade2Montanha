import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int vetork[] = new int[10];
        int soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o "  + (i  + 1)+ " número: " );
            vetork[i] = scanner.nextInt();
            soma += vetork[i];
            
        }
         System.out.println("A soma total dos elementos é: " + soma );

         scanner.close();
        }
}
