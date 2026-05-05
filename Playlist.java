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

    public void DisplaySongsAbovePlayCount(long minPlayCount)
    {
        for (Song s : songs) 
        {
            if (s.getPlayCount() > minPlayCount) 
            {
                System.out.println(s.getSongTitle() + " - Plays: " + s.getPlayCount());
            }
        }
    }
    
    public static void main(String[] args)
    {
        Playlist myPlaylist = new Playlist();
        
        myPlaylist.addSong(new Song("Shape of You", "Ed Sheeran", 4893718356L));
        myPlaylist.addSong(new Song("D O D O", "Tayc", 172800535L));
        myPlaylist.addSong(new Song("Havana", "Camilla Cabello", 2465034444L));
        myPlaylist.addSong(new Song("No Scrubs", "TLC", 1575003362L));
        myPlaylist.addSong(new Song("Fill Me In", "Craig David", 70010778L));
        myPlaylist.addSong(new Song("Just the Way You Are", "Bruno Mars", 3255275101L));
        myPlaylist.addSong(new Song("Genie in a Bottle", "Christina Aguilera", 740794605L));
        myPlaylist.addSong(new Song("Maria Maria", "Santana", 626285217L));
        myPlaylist.addSong(new Song("Flatline", "Justin Bieber", 286411374L));
        myPlaylist.addSong(new Song("Crazy In Love", "Beyonce", 1834515045L));
        myPlaylist.addSong(new Song("Smooth Criminal", "Michael Jackson", 1159042L));
        myPlaylist.addSong(new Song("Beautiful Girls", "Shaun Kingston", 1118596046L));

        System.out.println("---My playlist---");
        myPlaylist.displayPlaylist();
        System.out.println();
        System.out.println();

        System.out.println("Removing 'Shape of You' from playlist...");
        myPlaylist.removeSong("Shape of You");
        myPlaylist.displayPlaylist();
        System.out.println();
        System.out.println();

        long minPlays = 1000000000;
        
        System.out.println("Songs with more than " + minPlays + " plays:");
        myPlaylist.DisplaySongsAbovePlayCount(minPlays);

    }
}

class Song
{
    private String songTitle;
    private String artistName;
    private long playCount;

    public Song(String title, String artist, long plays)
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

    public long getPlayCount()
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

    public void setPlayCount(long playCount) 
    {
        this.playCount = playCount; 
    }


}

