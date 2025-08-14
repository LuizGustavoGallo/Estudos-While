import java.util.Scanner;

public class regressivo {
    public static void main(String[] args) {
        
        int contador; // inicialização da contagem 0

        Scanner leitor = new Scanner(System.in); // definido Scanner para entrada de usuarios

        // Coletadar a entrada do usuario
        System.out.println("Informe o começo da contagem: ");
        contador = leitor.nextInt(); // entrada do usúario será armazenada na variável NUM

        System.out.println("---Iniciando contagem---");
        // realizar a estrutura para a contagem regressiva 
        while (contador >= 0) {
           try {
            System.out.println(contador);
            Thread.sleep(1000); //Dará um a pausa de 1 seg durante a execução da contagem
            contador--;
           } catch (InterruptedException e) { //Usado para capturar uma interrupção na execução
            System.out.println("A contagem foi encerrada!");
           }
        }
        leitor.close();
    }
}
