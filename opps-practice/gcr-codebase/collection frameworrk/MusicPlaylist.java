import java.util.*;

public class MusicPlaylist {

    static LinkedList<String> playlist = new LinkedList<>();

    static void playSong(String song) {

        playlist.addFirst(song);

        if (playlist.size() > 10)
            playlist.removeLast();
    }

    static void searchSong(String song) {

        if (playlist.contains(song))
            System.out.println(song + " found.");
        else
            System.out.println(song + " not found.");
    }

    static void display() {

        System.out.println("Recently Played:");

        for (String song : playlist)
            System.out.println(song);
    }

    public static void main(String[] args) {

        playSong("Believer");
        playSong("Shape of You");
        playSong("Perfect");
        playSong("Closer");
        playSong("Thunder");
        playSong("Memories");
        playSong("Faded");
        playSong("Levitating");
        playSong("Senorita");
        playSong("Unstoppable");
        playSong("Bones");   // Removes oldest song

        searchSong("Perfect");

        display();
    }
}