package AbstractFactory;

public interface AbstractFactory {
    public Team getTeam(String playerName);
    public Country getCountry(String countryName);
}
