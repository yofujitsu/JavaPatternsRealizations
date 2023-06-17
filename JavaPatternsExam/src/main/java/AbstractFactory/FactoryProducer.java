package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String q) {
        if(q.equals("team")) return new TeamFactory();
        else if(q.equals("country")) return new CountryFactory();
        return null;
    }
}
