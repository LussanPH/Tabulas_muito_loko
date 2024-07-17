package dices;

public class MisfortuneDoubleDice extends DoubleDice {
    /*Iniciando esta classe filha*/
    public MisfortuneDoubleDice(){
        super();
    }

    @Override public int ThrowDices(){
    	int sum = ThrowDice(1) + ThrowDice(2);
    	if (sum > 6) {
    		sum -= 6;
    	}
    	return sum;
    }
}
