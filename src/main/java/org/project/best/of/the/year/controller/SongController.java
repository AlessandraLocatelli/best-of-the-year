package org.project.best.of.the.year.controller;

import org.project.best.of.the.year.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {


    @GetMapping
    public String songsList(Model model)
    {
        List<Song> songsList = getSongs();
        model.addAttribute("songs",songsList);

        return "songs/songs-list";

    }

    private List<Song> getSongs()
    {
        List<Song> songsList = new ArrayList<>();
        songsList.add(new Song(2212,"Black and Java,","by C Starling"));
        songsList.add(new Song(3589,"Deep blue Java,","by Jaxon Swift"));
        songsList.add(new Song(4521,"Greening Java,","by C# Javier"));


        return songsList;
    }



}
