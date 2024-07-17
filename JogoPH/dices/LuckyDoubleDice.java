package dices;

public class LuckyDoubleDice extends DoubleDice {
    /*Iniciando esta classe filha*/
    public LuckyDoubleDice(){
        super();
    }
    
    @Override public int ThrowDices(){
    	int sum = ThrowDice(1) + ThrowDice(2);
    	if (sum < 7) {
    		sum += 6;
    	}
    	return sum;
    }
}
