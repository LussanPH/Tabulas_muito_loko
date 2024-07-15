public class LuckyDoubleDice extends DoubleDice {
    /*Iniciando esta classe filha*/
    public LuckyDoubleDice(){
        super();
    }
    
    @Override public int ThrowDices(){
        return rdm.nextInt(4) + rdm.nextInt(3) + 7;//Dados sortudos, vão de 7 à 12
    }
}
