import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o seu nome!");
    String nome = scanner.next();

    System.out.println("Por favor, digite o número da sua agência!");
    int agência = scanner.nextInt();

    System.out.println("Por favor, digite o número da sua conta!");
    int conta = scanner.nextInt();
    
    System.out.println("Por favor, digite o seu saldo");
    double saldo = scanner.nextDouble();
    
    System.out.println("Olá, " + nome);
    System.out.println("obrigado por criar uma conta em nosso banco, sua agência é: " + agência + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
