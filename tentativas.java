import java.util.Scanner;

public class tentativas {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 

        int tentativas = 0; //Armazena o número de tentativas
        String senha = "Java123"; // Variavel que define a senha
        String senha_Digitada; // Senha digitada pelo usúario será armazenada nesta variavel

        System.out.println("Informe sua senha: ");
        senha_Digitada = leitor.nextLine(); // Coleta da entrada do usúario

        // Estrutura de repetição para validar a senha correta
        while (!senha_Digitada.equals(senha)) {
            System.out.println("Sua senha esta incorreta! Tente novamente: ");
            senha_Digitada = leitor.nextLine();
            tentativas++; // Soma a quantidade de tentativas
        } 

        System.out.println("Você tentou " + tentativas + " vezes antes de acertar a senha!");
        System.out.println("Abrindo sistema...");


        leitor.close();
    }
}