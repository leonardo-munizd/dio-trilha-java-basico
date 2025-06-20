import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o valor do depósito inicial: ");
        double saldo;
        try {
            String saldoTexto = scanner.nextLine().replace(",", ".");
            saldo = Double.parseDouble(saldoTexto);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Use apenas números no formato 0.00 ou 0,00.");
            scanner.close();
            return;
        }

        scanner.close();

        exibirMensagemFinal(nomeCliente, agencia, numeroConta, saldo);
    }

    public static void exibirMensagemFinal(String nome, String agencia, int conta, double saldo) {
        System.out.println("\n--- Conta Criada com Sucesso ---");
        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco.\n" +
            "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
            nome, agencia, conta, saldo
        );
    }
}


