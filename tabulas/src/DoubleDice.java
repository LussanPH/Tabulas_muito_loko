import java.util.Random;

public class DoubleDice {
    protected Random rdm;

    public DoubleDice(){
        this.rdm = new Random();
    }
    
    public int ThrowDices(){
        return rdm.nextInt(6) + rdm.nextInt(6) + 2;
    }

}
