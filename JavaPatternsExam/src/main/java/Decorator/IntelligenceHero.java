package Decorator;

public class IntelligenceHero implements Hero{
    private Hero hero;
    public IntelligenceHero(Hero hero) {this.hero = hero;}

    @Override
    public int getAgilityGain() {return this.hero.getAgilityGain();}
    @Override
    public int getStrengthGain() {return this.hero.getStrengthGain();}
    @Override
    public int getIntelligenceGain() {return this.hero.getIntelligenceGain()+5;}
}
