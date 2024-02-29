package br.com.fiap.banco;

public class Teste {
    public static void main(String[] args) {


        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.saque(100);


        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.saque(100);


        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.saque(100);


        System.out.println("Conta1: " + conta1.getSaldo());
        System.out.println("Conta2: " + conta2.getSaldo());
        System.out.println("Conta3: " + conta3.getSaldo());





        /*Conta conta = new Conta();
        Conta cc = new ContaCorrente();

        ContaCorrente c1 = (ContaCorrente) cc;

        if(conta instanceof ContaCorrente) {
            ContaCorrente c2 = (ContaCorrente) conta;
        }*/






        /*cc.setAgencia(111);
        cc.setNumero(222);
        cc.setTipo("PF");
        cc.setChequeEspecial(1000);


        Conta cc2 = new Conta();*/




/*        cc.depositar(50.0);
        cc.setAgencia(123);
        cc.setNumero(321);

        cc.depositar(1000);
        System.out.println(cc.getSaldo());



        Conta contaPoupanca = new Conta(111, 222, 1000);
        contaPoupanca.saque(50);
        System.out.println(contaPoupanca.getSaldo());*/

    }
}
