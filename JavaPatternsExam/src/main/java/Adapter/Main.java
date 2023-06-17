package Adapter;

public class Main {
    public static void main(String[] args) {
        Hero ember = new Hero(new MagicBuildAdapter()); //с паттерном
        Hero drow = new Hero(new StandartBuild());
        ember.choiceBuild();
        drow.choiceBuild();
    }
}
