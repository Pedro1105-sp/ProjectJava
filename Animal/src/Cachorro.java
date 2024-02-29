// EXTENDS -> É USADO PARA HERDAR AS CARACTÉRISTICAS DE UMA CLASSE PAI
public class Cachorro extends Animal {

    private String latido;

    public String getLatido(){
        return latido;
    }

    public void setLatido(String latido){
        this.latido = latido;
    }
}
