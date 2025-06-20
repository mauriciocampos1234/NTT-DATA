package services;

import entities.Conta;


public class TransacaoService {
    public void realizarTransferencia(Conta origem, Conta destino, double valor) {
        if (origem.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência.");
        }
    }

    public void registrarInvestimento(Conta conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Investimento registrado com sucesso!");
        } else {
            System.out.println("Falha ao registrar investimento.");
        }
    }
}
