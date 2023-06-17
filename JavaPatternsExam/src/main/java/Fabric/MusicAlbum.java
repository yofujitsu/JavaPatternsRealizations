package Fabric;

public class MusicAlbum {
    private final MusicGenreFactory factory;
    public MusicAlbum(MusicGenreFactory factory) {
        this.factory = factory;
    }

    public MusicGenre doMusic(MusicType type) {
        MusicGenre musicGenre = factory.createMusicGenre(type);
        musicGenre.doDrums();
        musicGenre.doMelody();
        musicGenre.doArrange();
        System.out.println("Альбом готов!");
        return musicGenre;
    }
}
