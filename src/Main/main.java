package Main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
        System.out.print("Digite o nome do cliente para extrato: ");
        String clienteExtrato = scan.nextLine();
        System.out.println("");

        switch (clienteExtrato.toLowerCase()) {
            case "andre":
                ccAndre.imprimir_extrato();
                break;
            case "maria":
                cpMaria.imprimir_extrato();
                break;
        }
    }

}
