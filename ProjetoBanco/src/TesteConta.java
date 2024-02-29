public class TesteConta {

    public static void main(String[] args) {

        Conta cc = new Conta(1000, 50.0);  // FOI GERADO O OBJETO EM MEMORIA CHAMADO contaCorrente

        System.out.println(cc.recuperarSaldo());

    }
}
