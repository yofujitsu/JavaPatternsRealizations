package Builder;

public class Main {
    public static void main(String[] args) {
        Director dir = new Director();
        Builder builder = new ConcreteBuilder();
        dir.construct(builder);
        Product pr = builder.getProduct();
        System.out.println(pr.getName());
    }
}
