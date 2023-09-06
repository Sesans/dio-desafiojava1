import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        float saldo;
        String agencia;
        String nomeCliente;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\tBem-vindo ao sistema Banco Terminal!\nDigite as informações necessárias para registrar seu cadastro!");
        System.out.print("Por favor, digite o nome do senhor(a): ");
        nomeCliente = entrada.nextLine();
        System.out.print("O número da agência: ");
        agencia = entrada.nextLine();
        System.out.print("O número da conta: ");
        numeroConta = entrada.nextInt();
        System.out.print("O saldo da conta: ");
        saldo = entrada.nextFloat();

        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque!");
    }
}