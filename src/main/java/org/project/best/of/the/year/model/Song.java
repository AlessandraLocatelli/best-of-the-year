package org.project.best.of.the.year.model;

public class Song {

private int songID;
private String songTitle;

private String songAuthor;

public Song(int songID, String songTitle, String songAuthor)
{

    this.songID = songID;
    this.songTitle = songTitle;
    this.songAuthor = songAuthor;

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

    public String getSongAuthor() {
        return songAuthor;
    }

    public void setSongAuthor(String songAuthor) {
        this.songAuthor = songAuthor;
    }
}
