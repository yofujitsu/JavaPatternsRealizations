package Strategy;

public class Main {
    public static void main(String[] args) {
        Strategy strategy1 = new ConcreteStrategy1();
        Context context = new Context(strategy1);
        context.executeStrategy();
        Strategy strategy2 = new ConcreteStrategy2();
        context.setStrategy(strategy2);
        context.executeStrategy();
    }
}
