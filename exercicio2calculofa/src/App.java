import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numeros = 0;
        int fatorial = 1;

        System.out.println("Digite um número inteiro para cálculo: ");
        numeros = scanner.nextInt();

        if(numeros < 0 ){
            System.out.println("Números negativos não são válidos!!");
        }
        else{

        for(int i = 1; i <= numeros; i++ ){
            fatorial *= i;
        }      
     System.out.println(fatorial);
    }
}
}

