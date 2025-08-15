import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int contador = 0;

        System.out.println("Informe a tabuada que deseja ver: ");
        int numero = leitor.nextInt();

        // Estrutura de repetição para realizar a tabuada
        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(+ numero + " x " + contador + " = " + resultado);
            contador ++;
        }
        leitor.close();
    }
}
