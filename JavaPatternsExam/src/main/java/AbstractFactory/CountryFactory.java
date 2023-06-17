package AbstractFactory;

public class CountryFactory implements AbstractFactory{
    @Override
    public Team getTeam(String playerName) {
        return null;
    }

    @Override
    public Country getCountry(String countryName) {
        if(countryName == null) return null;
        if(countryName.equals("England")) return new England();
        else if(countryName.equals("Spain")) return new Spain();
        return null;
    }
}
