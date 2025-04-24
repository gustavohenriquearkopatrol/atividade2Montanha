public class App {
    public static void main(String[] args) throws Exception {

        int numero1 = 0;
        int numero2 = 1;
        int contador = 0;

        while(contador < 10){
            System.out.print(numero1 + ", ");
            int numero3 = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero3;
            contador++;

        }
        }
}
