public class App {
    public static void main(String[] args) throws Exception {
        DoubleDice dice1 = new DoubleDice();
        LuckyDoubleDice dice2 = new LuckyDoubleDice();
        MisfortuneDoubleDice dice3 = new MisfortuneDoubleDice();

        System.out.println("DoubleDice throw result: " + dice1.ThrowDices());
        System.out.println("LuckyDoubleDice throw result: " + dice2.ThrowDices());
        System.out.println("MisfortuneDoubleDice throw result: " + dice3.ThrowDices());
    }
}
