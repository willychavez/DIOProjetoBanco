package Principal;

import Banco.Cliente;
import Banco.Conta;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente willy = new Cliente();
        willy.setNome("Willy");

        Conta cc = new ContaCorrente(willy);
        Conta poupanca = new ContaPoupanca(willy);

        cc.depositar(200);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
