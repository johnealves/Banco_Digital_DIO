package Main;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir_extrato() {
        System.out.println("Extrato Conta Poupança");
        super.imprimirInfoConta();
    }
}
