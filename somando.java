import java.util.Scanner;

public class somando {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); // Scanner definido como leitor

        //variáveis NÚMERO definido para entrada do usúario e SOMA definido para somar a entrada 
        int soma = 0;
        int numero = 0;

        // Estrutura de repetição utilizada para coletar entrada do usúario até que um número negativo seja digitado.
        while (numero >= 0) {
            System.out.println("Informe um número [Digite um número negativo para parar.]");
            numero = leitor.nextInt(); // Coleta da entrada do usúario

            if (numero >= 0) { // validação de número positivo
                soma += numero; // Irá somar o número inserido apenas se for positivo
            // Encerrará a execução se for inserido um número negativo
            } else if (numero < 0) { 
                System.out.println("Encerrando.");
            }
        }
        System.out.println("A soma de todos os números digitados é: " + soma); // Mostrará o resultado final da soma de todos os números positivos inseridos

        leitor.close();
    }
}