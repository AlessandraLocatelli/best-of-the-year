package org.project.best.of.the.year.controller;


import org.project.best.of.the.year.Artist;
import org.project.best.of.the.year.Movie;
import org.project.best.of.the.year.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class BestOfTheYearController {

    @GetMapping
    public String getBestOfTheYearArtist(Model model)
    {

        Artist artist = getArtistFullName();
        model.addAttribute("bestArtist",artist);

        return "artist-homepage";
    }

    @GetMapping("/movies")
    public String checkMovies(Model model)
    {
        List<Movie> moviesList = getBestMovies();
        model.addAttribute("bestMovies",moviesList);


        return "movies";
    }

    @GetMapping("/songs")
    public String checkSongs(Model model)
    {
       List<Song> songsList = getBestSongs();
       model.addAttribute("bestSongs",songsList);

        return "songs";

    }

    private Artist getArtistFullName()
    {
        Artist artist = new Artist("Alessandra","Locatelli");
        return artist;

    }

   private List<Song> getBestSongs()
   {
       List<Song> songsList = new ArrayList<>();
       songsList.add(new Song(2212,"Leaves in yellow."));
       songsList.add(new Song(3589,"Fire song."));
       songsList.add(new Song(4521,"Crashing Waterfall."));


       return songsList;
   }


   private List<Movie> getBestMovies()
   {

       List<Movie> moviesList = new ArrayList<>();
       moviesList.add(new Movie(9081,"Don't look behind the waterfall."));
       moviesList.add(new Movie(5461, "The city of fire."));
       moviesList.add(new Movie(7056, "Yellow run."));


       return moviesList;
   }




}
