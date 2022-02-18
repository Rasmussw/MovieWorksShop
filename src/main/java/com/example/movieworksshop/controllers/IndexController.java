package com.example.movieworksshop.controllers;

import com.example.movieworksshop.services.DataAnalysis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IndexController {
    DataAnalysis dataAnalysis = new DataAnalysis();

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to my movie aplication";
    }

    @GetMapping("/getFirst")
    public String getFirst(){
        return "Den første film i listen er " + dataAnalysis.getFirst();
    }

    @GetMapping("/getRandom")
    public String getRandom(){
        return "Her er en random film: " + dataAnalysis.getRandom();
    }

    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity(){
        return "her er 10 random film, listet med de mest populære først: " + dataAnalysis.getTenSortByPopularity();
    }

    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward(){
        return "Der er " + dataAnalysis.howManyWonAnAward() + " film der har vundet en pris";
    }

    @GetMapping("/filter")
    public String filter(@RequestParam String year, @RequestParam String times){
        return "hej";
    }

}
