package org.project.best.of.the.year;

public class Movie {

    private int movieID;
    private String movieTitle;

    public Movie(int movieID, String movieTitle) {
        this.movieID = movieID;
        this.movieTitle = movieTitle;
    }

   public Movie()
   {


   }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
}
