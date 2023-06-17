package Decorator;

public class Main {
    public static void main(String[] args) {
        Hero pango = new UniversalHero();
        System.out.println("s = " + String.valueOf(pango.getStrengthGain()));
        System.out.println("a = " + String.valueOf(pango.getAgilityGain()));
        System.out.println("i = " + String.valueOf(pango.getIntelligenceGain()));

        Hero meepo = new AgilityHero(pango);
        System.out.println("s = " + String.valueOf(meepo.getStrengthGain()));
        System.out.println("a = " + String.valueOf(meepo.getAgilityGain()));
        System.out.println("i = " + String.valueOf(meepo.getIntelligenceGain()));

        Hero pudge = new StrengthHero(pango);
        System.out.println("s = " + String.valueOf(pudge.getStrengthGain()));
        System.out.println("a = " + String.valueOf(pudge.getAgilityGain()));
        System.out.println("i = " + String.valueOf(pudge.getIntelligenceGain()));

        Hero lina = new IntelligenceHero(pango);
        System.out.println("s = " + String.valueOf(lina.getStrengthGain()));
        System.out.println("a = " + String.valueOf(lina.getAgilityGain()));
        System.out.println("i = " + String.valueOf(lina.getIntelligenceGain()));
    }
}
