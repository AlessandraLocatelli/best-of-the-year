package org.project.best.of.the.year.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getBestOfTheYearArtist(Model model)
    {
        model.addAttribute("name","Alessandra");

        return "artist-homepage";
    }

}
