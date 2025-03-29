import java.util.Scanner;  // Importa a classe Scanner para capturar entradas do usuário

public class ContaTerminal {  // Define a classe chamada 'ContaTerminal'

    static int numeroUsuario = 1021;  // A variável 'numeroUsuario' é um valor fixo representando o número do usuário
    static double saldo = 237.48;  // A variável 'saldo' define o saldo da conta bancária, pré-definido como 237,48

    public static void main(String[] args) {  // Método principal (main) que é executado ao rodar o programa

        // Abrir o scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);  // Cria uma instância do Scanner para ler as entradas do teclado

        // Solicitar o número da agência
        System.out.println("Por favor, digite o número da sua Agência:");  // Exibe uma mensagem pedindo para o usuário digitar o número da agência
        String agencia = scanner.nextLine();  // Lê a entrada do usuário e armazena na variável 'agencia'

        // Exibir o número de usuário (pré-definido)
        System.out.println("O seu número de Usuário é: " + numeroUsuario);  // Exibe o número de usuário fixo (1021)

        // Solicitar o nome do cliente
        System.out.println("Digite o nome do Cliente:");  // Exibe uma mensagem pedindo para o usuário digitar o nome do cliente
        String nome = scanner.nextLine();  // Lê a entrada do usuário e armazena o nome do cliente na variável 'nome'

        // Fechar o scanner após o uso
        scanner.close();  // Após capturar todas as entradas, o scanner é fechado para liberar os recursos

        // Exibir a mensagem final para o cliente com todos os detalhes
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia );
        System.out.println("Seu numero de conta é " + numeroUsuario + " e seu saldo de R$ " + saldo + " ja esta disponivel para saque.");
    }
}
