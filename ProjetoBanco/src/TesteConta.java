public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta();  // FOI GERADO O OBJETO EM MEMORIA CHAMADO contaCorrente
        Conta contaPoupanca = new Conta();  // FOI GERADO O OBJETO EM MEMORIA CHAMADO contaPoupanca
        Conta contaInvestimento = new Conta();


        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente.nome = "Pedro Henrique";
        contaCorrente.cliente.idade = 19;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30.5;
        contaPoupanca.cliente.nome = "Henrique";
        contaPoupanca.cliente.idade = 29;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40.5;
        contaInvestimento.cliente.nome = "Alves";
        contaInvestimento.cliente.idade = 39;

        System.out.println(contaCorrente.numero);
        //System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.verSaldo());
        System.out.println(contaCorrente.deposito(20.0));
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);


    }
}
