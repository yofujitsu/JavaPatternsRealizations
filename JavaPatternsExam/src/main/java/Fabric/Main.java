package Fabric;

public class Main {
    public static void main(String[] args) {
        MusicGenreFactory factory = new MusicGenreFactory();
        MusicType type = MusicType.JAZZ;
        MusicGenre genre = factory.createMusicGenre(type);
        MusicAlbum album = new MusicAlbum(factory);
        System.out.println(album.doMusic(type));
    }

}
