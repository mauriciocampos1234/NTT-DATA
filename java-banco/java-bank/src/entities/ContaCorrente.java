package entities;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public void exibirResumo() {
        System.out.println("Conta Corrente - Número: " + getNumero() + ", Titular: " + getTitular() + ", Saldo: " + getSaldo());
    }
}
