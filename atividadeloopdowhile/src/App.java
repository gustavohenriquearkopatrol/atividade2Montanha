import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (numero < 1 || numero > 100);

        System.out.println("Número válido digitado: " + numero);

        scanner.close();
            
           }


         }
        

