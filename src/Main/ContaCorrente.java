package Main;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir_extrato() {
        System.out.println("Extrato Conta Corrente");
        super.imprimirInfoConta();
    }
}
