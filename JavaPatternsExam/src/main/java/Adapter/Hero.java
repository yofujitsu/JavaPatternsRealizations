package Adapter;

public class Hero {
    private Build build;
    public Hero(Build build) {
        this.build = build;
    }

    public Hero(){}

    public void choiceBuild() {
        System.out.println("start the game");
        build.assemble();
        System.out.println("GGWP");
    }
}
