public class Conta {

    int numero;
    double saldo;


    public double verSaldo(){
        return  saldo;
    }

    public double deposito(double valor){
        return saldo = saldo + valor;
    }


    Cliente cliente = new Cliente();


}
