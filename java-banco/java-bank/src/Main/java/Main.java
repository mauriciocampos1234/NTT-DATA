package Main.java;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import repositories.ContaRepository;
import services.TransacaoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaRepository contaRepository = new ContaRepository();
        TransacaoService transacaoService = new TransacaoService();

        while (true) {
            System.out.println("\n--- Sistema Bancário ---");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Investir");
            System.out.println("6. Listar Contas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da conta: ");
                    String numero = scanner.nextLine();
                    System.out.print("Digite o nome do titular: ");
                    String titular = scanner.nextLine();
                    System.out.print("Tipo de conta (1 - Corrente, 2 - Poupança): ");
                    int tipo = scanner.nextInt();
                    Conta novaConta = tipo == 1 ? new ContaCorrente(numero, titular) : new ContaPoupanca(numero, titular);
                    contaRepository.adicionarConta(novaConta);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    // Implementar depósito
                    System.out.print("Digite o número da conta: ");
                    String numeroContaDeposito = scanner.nextLine();
                    Conta contaDeposito = contaRepository.buscarContaPorNumero(numeroContaDeposito);
                    if (contaDeposito != null) {
                        System.out.print("Digite o valor do depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        contaDeposito.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    // Implementar saque
                    System.out.print("Digite o número da conta: ");
                    String numeroContaSaque = scanner.nextLine();
                    Conta contaSaque = contaRepository.buscarContaPorNumero(numeroContaSaque);
                    if (contaSaque != null) {
                        System.out.print("Digite o valor do saque: ");
                        double valorSaque = scanner.nextDouble();
                        if (contaSaque.sacar(valorSaque)) {
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 4:
                    // Implementar transferência
                    System.out.print("Digite o número da conta de origem: ");
                    String numeroContaOrigem = scanner.nextLine();
                    Conta contaOrigem = contaRepository.buscarContaPorNumero(numeroContaOrigem);
                    if (contaOrigem == null) {
                        System.out.println("Conta de origem não encontrada!");
                        break;
                    }
                    break;
                case 5:
                    // Implementar investimento
                    System.out.print("Digite o número da conta para investimento: ");
                    String numeroContaInvestimento = scanner.nextLine();
                    Conta contaInvestimento = contaRepository.buscarContaPorNumero(numeroContaInvestimento);
                    if (contaInvestimento != null) {
                        System.out.print("Digite o valor do investimento: ");
                        double valorInvestimento = scanner.nextDouble();
                        transacaoService.registrarInvestimento(contaInvestimento, valorInvestimento);
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 6:
                    contaRepository.listarContas().forEach(Conta::exibirResumo);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
