import java.util.Scanner;

public class contagem {

    public static void main(String[] args) {
        
        int contador = 0; // váriavel que inicia a contagem em 0

        Scanner leitor = new Scanner(System.in); // definido Scanner para coleta de entrada de dados

        System.out.println("Informe a contagem que deseja: ");
        int num = leitor.nextInt(); // quantidade desejada pelo usúario será armazenada na variável NUM

        // metodo de repetição até a condição ser verdadeira
        while (contador <= num) {
            System.out.println(contador);
            contador++; // irá somar +1 na contagem até chegar a condição sujerida
        }
        leitor.close(); // fechamento do Scanner
    }
}