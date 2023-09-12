package org.project.best.of.the.year;

public class Song {

private int songID;
private String songTitle;

public Song(int songID, String songTitle)
{

    this.songID = songID;
    this.songTitle = songTitle;

}


    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
}
