public class App {
    public static void main(String[] args) throws Exception {

        int numero = 1;
        int resultado = 0;

        for(int i = 1; i <= 10; i++){
        resultado = numero * 5;
        numero = numero + 1;
        System.out.println("5 x " + i + " = " + resultado);
        }
    }
}
