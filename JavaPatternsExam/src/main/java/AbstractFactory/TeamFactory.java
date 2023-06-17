package AbstractFactory;

public class TeamFactory implements AbstractFactory{
    @Override
    public Country getCountry(String countryName) {
        return null;
    }

    @Override
    public Team getTeam(String playerName) {
        if(playerName == null) return null;
        if(playerName.equals("haaland")) return new ManCity();
        else if(playerName.equals("bellingham")) return new Real();
        return null;
    }
}
