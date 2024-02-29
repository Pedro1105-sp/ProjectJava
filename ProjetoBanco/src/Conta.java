public class Conta {

    private int numero;
    private double saldo;


    // MÉTODO CONSTRUTOR --> O MÉTODO CONSTRUTOR TEM O MESMO NOME DA CLASSE
        // OS CONSTRUTORES SÃO MUITOS PARECIDOS COM MÉTODOS COMUNS, PORÉM HÁ 3 DIFERENÇA BÁSICAS:
            // 1) POSSUEM O MESMO NOME DA CLASSE, 2) NÃO TÊM TIPO DE RETORNO (NEM VOID), 3) NÃO PODEM RETORNAR VALOR NO MÉTODO USANDO A INSTRUÇÃO RETURN

    public Conta(){}                                // CONTRUTOR PADRÃO

    public Conta(int numero){                      // SOBRECARGA DE CONTRUSTORES CLASSE
        this.numero = numero;
        this.saldo = 0;
    }

    public Conta(double numero){                   // SOBRECARGA DE CONTRUSTORES CLASSE
        this.saldo = saldo;
    }

    public Conta (int numero, double saldo) {       // CONSTRUTOR DE CLASSE
        this.numero = numero;
        this.saldo = saldo;
    }

    public double recuperarSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

}
