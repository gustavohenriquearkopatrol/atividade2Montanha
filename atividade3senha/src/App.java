import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double senha;
        int senhaC;
        

        senha = 1234;

        System.out.println("Digite sua senha: ");
        senhaC = scanner.nextInt();

        while(senhaC != senha){
           System.out.println("Senha incorreta tente novamente: ");
           senhaC = scanner.nextInt();

        }
        System.out.println("Senha correta bem-vindo: ");

        







    }
}
