package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory teamFactory = FactoryProducer.getFactory("team");
        Team mancity = teamFactory.getTeam("haaland");
        mancity.players();
        Team real = teamFactory.getTeam("bellingham");
        real.players();

        AbstractFactory countryFactory = FactoryProducer.getFactory("country");
        Country eng = countryFactory.getCountry("England");
        eng.name();
        Country sp = countryFactory.getCountry("Spain");
        sp.name();
    }
}
