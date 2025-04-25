import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int resposta = 0;

        do{
            System.out.println("1. Adicionar \n2. Remover \n3. Sair");
            resposta = scanner.nextInt();

            if (resposta == 1) {
                System.out.println("Item adicionado com sucesso!\n");
            }
             else if (resposta == 2) {
                System.out.println("Item removido com sucesso!\n");
            }
             

            } while (resposta != 3);
            System.out.println("Sistema finalizado com sucesso");
            
             

             scanner.close();


        }
        


    }

