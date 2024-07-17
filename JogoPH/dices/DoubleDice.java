package dices;
import java.util.Random; //bibliotéca de números aleatórios

public class DoubleDice {
    protected Random rdm; //objetico que cria números aleatórios
    protected int dice1;
    protected int dice2;
    /*Iniciando Dado Duplo*/
    public DoubleDice(){
        this.rdm = new Random();
        this.dice1 = 0;
        this.dice2 = 0;
    }
    
    protected int ThrowDice(int dice) {
    	if(dice == 1) {
    		this.dice1 = rdm.nextInt(6) + 1;
    		return this.dice1;
    	}
    	else if(dice == 2) {
    		this.dice2 = rdm.nextInt(6) + 1;
    		return this.dice2;
    	}
    	else {
    		return 0;
    	}
    }
    
    /*Jogando os dados*/
    public int ThrowDices(){
        return  ThrowDice(1) + ThrowDice(2) ; //Dados Normais, vão de 2 a 12
    }
    
    
    public boolean DicesAreEqual() {
    	if(this.dice1 == this.dice2 && this.dice1 != 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    

}
