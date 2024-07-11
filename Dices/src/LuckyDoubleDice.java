public class LuckyDoubleDice extends DoubleDice {
    public LuckyDoubleDice(){
        super();
    }

    @Override public int ThrowDices(){
        return rdm.nextInt(4) + rdm.nextInt(3) + 7;
    }
}
