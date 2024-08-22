import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nome;
        String sobrenome;
        Double saldo;

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.next();

        System.out.println("Digite o valor que deseja depositar: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá, " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
