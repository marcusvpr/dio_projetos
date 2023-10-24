import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("\nOlá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " +
         agencia + ", conta " + numero + " e seu saldo R$" + 
         saldo + " já está disponível para saque.");

        sc.close();
    }
}
