import java.util.Random; //bibliotéca de números aleatórios

public class DoubleDice {
    protected Random rdm; //objetico que cria números aleatórios
    /*Iniciando Dado Duplo*/
    public DoubleDice(){
        this.rdm = new Random();
    }
    /*Jogando os dados*/
    public int ThrowDices(){
        return rdm.nextInt(6) + rdm.nextInt(6) + 2; //Dados Normais, vão de 2 a 12
    }

}
