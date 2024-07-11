public class MisfortuneDoubleDice extends DoubleDice {
    public MisfortuneDoubleDice(){
        super();
    }

    @Override public int ThrowDices(){
        return rdm.nextInt(3) + rdm.nextInt(3) + 2;
    }
}
