package Main;

public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimir_extrato();
}
