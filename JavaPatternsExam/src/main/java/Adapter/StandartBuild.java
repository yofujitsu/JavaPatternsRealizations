package Adapter;

public class StandartBuild implements Build{
    @Override
    public void assemble() {
        System.out.println("standart build");
    }
}
