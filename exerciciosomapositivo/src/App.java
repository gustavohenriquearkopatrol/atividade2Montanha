import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double numero = 0;
        double soma = 0;
        

        while(numero >= 0) {
            System.out.println("Digite um número inteiro positivo (ou negativo para sair): ");
            numero = scanner.nextInt();

            if (numero <  0) {
                System.out.println("Saindo do programa...");
                break;
            }

            soma += numero;
        }
        
        System.out.println(soma);
        
    }
}