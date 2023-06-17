package Adapter;

public class MagicBuildAdapter implements Build{
    private MagicBuild build;
    public MagicBuildAdapter() {
        build = new MagicBuild();
    }

    @Override
    public void assemble() {
        build.track();
    }
}
