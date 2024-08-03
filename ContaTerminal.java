package ContaBancaria;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o número da sua conta: ");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha deixada pelo nextInt()
        scanner.nextLine();

        System.out.println("Por favor, informe o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s,\nObrigado por criar uma conta em nosso banco.\nSua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

    }

}