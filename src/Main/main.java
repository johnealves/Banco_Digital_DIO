package Main;

public class main {

    public static void main(String[] args) {
        Cliente Andre = new Cliente();
        Cliente Maria = new Cliente();
        Andre.setNome("Andre Santos");
        Maria.setNome("Maria Silva");

        // operações das contas
        ContaCorrente ccAndre = new ContaCorrente(Andre);
        ContaPoupanca cpMaria = new ContaPoupanca(Maria);

        ccAndre.depositar(100);
        ccAndre.transferir(75, cpMaria);

        // Imprime extrato das contas
        ccAndre.imprimir_extrato();
        System.out.println("");
        cpMaria.imprimir_extrato();
    }

}
