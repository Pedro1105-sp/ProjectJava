//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 10;                 // DECLARAÇÃO DE UMA VARIÁVEL DO TIPO INT
        double d = x;               // VARIÁVEL DOUBLE RECEBE UM TIPO INT -> DOUBLE É MAIOR QUE INT
        long l =x;                  // VARIÁVEL LONG RECEBE UM TIPO INT -> LONG É MAIOR QUE INT E DOUBLE
        float f = x;                // VARIÁVEL FLOAT RECEBE UM TIPO INT (ATENÇÃO) -> FLOAT É MAIOR QUE INT, LONG E DOUBLE
        short s = 20;               // DECLARAÇÃO DE UMA VARIÁVEL DO TIPO SHORT -> SHORT É MENOR QUE O INTEIRO
        x = s;                      // VARIÁVEL INT RECEBE UM TIPO SHORT

        // BYTE -> SHORT -> INT -> LONG -> DEFAULT


        // CONVERSÃO EXPLICITA -> OU FAZER O "CASTING OU CAST", CONVERTENDO O DOUBLE PARA INTEIRO(INT)
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

    }
}