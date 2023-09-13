package org.project.best.of.the.year.controller;

import org.project.best.of.the.year.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {


    @GetMapping
    public String moviesList(Model model)
    {
        List<Movie> moviesList = getMovies();
        model.addAttribute("movies",moviesList);


        return "movies/movies-list";
    }


    private List<Movie> getMovies()
    {

        List<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie(9081,"Don't look behind Java,"," by James Python"));
        moviesList.add(new Movie(5461, "The city of Java,"," by Xavier C++"));
        moviesList.add(new Movie(7056, "The Java run,"," by Ruby Chang"));


        return moviesList;
    }




}
