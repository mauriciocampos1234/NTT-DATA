package entities;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public void exibirResumo() {
        System.out.println("Conta Poupança - Número: " + getNumero() + ", Titular: " + getTitular() + ", Saldo: " + getSaldo());
    }
}
