package org.project.best.of.the.year.controller;


import org.project.best.of.the.year.Artist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String checkMovies()
    {

        return "movies";
    }

    @GetMapping("/songs")
    public String checkSongs()
    {


        return "songs";

    }

    private Artist getArtistFullName()
    {
        Artist artist = new Artist("Alessandra","Locatelli");
        return artist;

    }

}
