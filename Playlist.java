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

