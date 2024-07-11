public class MisfortuneDoubleDice extends DoubleDice {
    /*Iniciando esta classe filha*/
    public MisfortuneDoubleDice(){
        super();
    }

    @Override public int ThrowDices(){
        return rdm.nextInt(3) + rdm.nextInt(3) + 2;//Dado Azarado, range de 2 à 6
    }
}
