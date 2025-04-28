import java.util.Scanner;

public class App {

    static double montante1(double principal, double juros, double tempo){
        double montante;
        montante = principal * (1 + (juros / 100) * tempo);
        return montante;

    }

    static double montante2(double principal, double juros, double tempo){
        double montante;
        montante = principal * Math.pow(1 + (juros / 100), tempo);
        return montante;

    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

          //minhas váriaveis
          int tempo;
          double principal;
          double juros;
          double montante;
          double resultado;
          double acumulado;
          String resposta;
          String respostaSN;

        do {  //solicitar o usuário
            System.out.print("Digite o valor do investimento inicial: ");
            principal = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual: ");
            juros = scanner.nextDouble();

            System.out.print("Digite o período de investimento em anos: ");
            tempo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite a forma de capitalização (simples ou composto): ");
            resposta = scanner.nextLine();
           //cálculo
            montante = principal * (1 + juros / 100 * tempo);

              //simples e composto
              if (resposta.equalsIgnoreCase("simples")) {
                System.out.printf("Montante final:" +  montante1(principal, juros, tempo) + "\n");

            } else if(resposta.equalsIgnoreCase("composto")) {
                System.out.printf("Montante final:" +  montante2(principal, juros, tempo) + "\n");
            
            }else{
                System.out.println("Coloque apenas simples ou composto");
            }

            System.out.println("Deseja continuar? (s/n): ");
            respostaSN = scanner.nextLine();
        
             
            }while(!respostaSN.equals("n"));
            System.out.println("Fim do cálculo :) ");

           
           scanner.close();
            
}
}
