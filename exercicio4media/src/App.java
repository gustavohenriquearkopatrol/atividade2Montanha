import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double media;
        double nota; 
        double somaDasNotas = 0;
        int quantidaDeNotas = 0;
        String continuar;

        do {
            System.out.print("Digite uma nota (0 a 10): ");
            nota = scanner.nextDouble();
            scanner.nextLine();

            if(nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                break;
            }
            System.out.println("Deseja digitar outra nota? (s/n): ");
            continuar = scanner.nextLine();

            somaDasNotas += nota;
            quantidaDeNotas++;

        }while(!continuar.equals("n"));
        media = somaDasNotas / quantidaDeNotas;
        System.out.println("A soma das notas é: " + somaDasNotas);

        scanner.close();
    }
}