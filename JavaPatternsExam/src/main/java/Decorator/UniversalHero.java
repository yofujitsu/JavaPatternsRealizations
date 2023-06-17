package Decorator;

public class UniversalHero implements Hero{
    private int agilityGain = 0;
    private int strengthGain = 0;
    private int intelligenceGain = 0;

    @Override
    public int getAgilityGain() {
        return agilityGain;
    }

    @Override
    public int getStrengthGain() {
        return strengthGain;
    }

    @Override
    public int getIntelligenceGain() {
        return intelligenceGain;
    }


}
