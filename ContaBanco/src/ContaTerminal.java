import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Bem-vindo, esse e o sistema de criação de conta no TerminalBank, siga as instruções a seguir!");

        System.out.println("Por favor, digite o número da agência");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite a agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Óla " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
