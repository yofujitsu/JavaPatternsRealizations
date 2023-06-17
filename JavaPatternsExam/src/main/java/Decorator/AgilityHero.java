package Decorator;

public class AgilityHero implements Hero{
    private Hero hero;
    public AgilityHero(Hero hero) {this.hero = hero;}

    @Override
    public int getAgilityGain() {return this.hero.getAgilityGain()+5;}
    @Override
    public int getStrengthGain() {return this.hero.getStrengthGain();}
    @Override
    public int getIntelligenceGain() {return this.hero.getIntelligenceGain();}
}
