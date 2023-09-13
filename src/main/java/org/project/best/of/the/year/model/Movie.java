package org.project.best.of.the.year.model;

public class Movie {

    private int movieID;
    private String movieTitle;

    private String movieDirector;

    public Movie(int movieID, String movieTitle, String movieDirector) {
        this.movieID = movieID;
        this.movieTitle = movieTitle;
        this.movieDirector = movieDirector;
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

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }
}
