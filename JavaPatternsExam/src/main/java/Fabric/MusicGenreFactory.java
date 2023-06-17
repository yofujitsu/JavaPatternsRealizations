package Fabric;

public class MusicGenreFactory {
    public static MusicGenre createMusicGenre(MusicType musicType) {
        MusicGenre musicGenre = null;
        switch(musicType) {
            case ROCK:
                musicGenre = new Rock();
                break;
            case JAZZ:
                musicGenre = new Jazz();
                break;
            case POP:
                musicGenre = new Pop();
                break;
            case RAP:
                musicGenre = new Rap();
                break;
        }
        return musicGenre;
    }
}
