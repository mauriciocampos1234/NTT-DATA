package repositories;

import entities.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarContaPorNumero(String numero) {
        return contas.stream()
                .filter(conta -> conta.getNumero().equals(numero))
                .findFirst()
                .orElse(null);
    }

    public List<Conta> listarContas() {
        return contas;
    }
}
