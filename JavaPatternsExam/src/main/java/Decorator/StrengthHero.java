package Decorator;

public class StrengthHero implements Hero{
    private Hero hero;
    public StrengthHero(Hero hero) {this.hero = hero;}

    @Override
    public int getAgilityGain() {return this.hero.getAgilityGain();}
    @Override
    public int getStrengthGain() {return this.hero.getStrengthGain()+5;}
    @Override
    public int getIntelligenceGain() {return this.hero.getIntelligenceGain();}
}
