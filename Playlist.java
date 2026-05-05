import java.util.ArrayList;

public class Playlist
{
    private ArrayList<Song> songs = new ArrayList<>();
    
    public void addSong(Song song)
    {
        songs.add(song);
    }

    public void removeSong(String title)
    {
        songs.removeIf(s -> s.getSongTitle().equalsIgnoreCase(title));
    }

    public void displayPlaylist()
    {
        for (Song s : songs)
        {
            System.out.println(s.getSongTitle() + " by " + s.getArtistName());        
        }     
    }

    public void displaySongsAfterXPlays(int minPlayCount)
    {
        for (Song s : songs) 
        {
            if (s.getPlayCount() > minPlayCount) 
            {
                System.out.println(s.getSongTitle() + " - Plays: " + s.getPlayCount());
            }
        }
    }
}

class Song
{
    private String songTitle;
    private String artistName;
    private int playCount;

    public Song(String title, String artist, int plays)
    {
        this.songTitle = title;
        this.artistName = artist;
        this.playCount = plays;
    }

    public String getSongTitle() 
    {
        return this.songTitle;
    }

    public String getArtistName() 
    {
        return this.artistName;
    }

    public int getPlayCount()
    {
        return this.playCount;
    }

    public void setSongTitle(String songTitle) 
    {
        this.songTitle = songTitle;
    }

    public void setArtistName(String artistName) 
    {
        this.artistName = artistName;
    }

    public void setPlayCount(int playCount) 
    {
        this.playCount = playCount; 
    }


}

public class Main
{
    public static void main(String[] args)
    {
        Playlist myPlaylist = new Playlist();
        
        myPlaylist.addSong(new Song("Shape of You", "Ed Sheeran", 4893718356));
        myPlaylist.addSong(new Song("D O D O", "Tayc", 172800535));
        myPlaylist.addSong(new Song("Havana", "Camilla Cabello", 2465034444));
        myPlaylist.addSong(new Song("No Scrubs", "TLC", 1575003362));
        myPlaylist.addSong(new Song("Fill Me In", "Craig David", 70010778));
        myPlaylist.addSong(new Song("Just the Way You Are", " Bruno Mars", 3255275101));
        myPlaylist.addSong(new Song("Genie in a Bottle", "Christina Aguilera", 740794605));
        myPlaylist.addSong(new Song("Maria Maria", "Santana", 626285217));
        myPlaylist.addSong(new Song("Flatline", "Justin Bieber", 286411374));
        myPlaylist.addSong(new Song("Crazy In Love", "Beyonce", 1834515045));
        myPlaylist.addSong(new Song("Smooth Criminal", "Michael Jackson", 1159042));
        myPlaylist.addSong(new Song("Beautiful Girls", "Shaun Kingston", 1118596046));

        System.out.println("---My playlist---");
        myPlaylist.displayPlaylist();
        System.out.println();
        System.out.println();

        System.out.println("Removing 'Shape of You' from playlist...");
        myPlaylist.removeSong("Shape of You");
        myPlaylist.displayPlaylist();
        System.out.println();
        System.out.println();

        int minPlays = 1000000000;
        System.out.println("Songs with more than " + minPlays + " plays:");
        myPlaylist.displaySongsAfterXPlays(minPlays);

    }
}
