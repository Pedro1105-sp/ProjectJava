package br.com.fiap.banco;

public class Teste {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Conta cc = new ContaCorrente();

        ContaCorrente c1 = (ContaCorrente) cc;

        if(conta instanceof ContaCorrente) {
            ContaCorrente c2 = (ContaCorrente) conta;
        }






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
