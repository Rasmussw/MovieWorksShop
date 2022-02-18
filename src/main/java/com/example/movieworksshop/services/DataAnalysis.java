package com.example.movieworksshop.services;

import com.example.movieworksshop.models.Movie;
import com.example.movieworksshop.models.ReadFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class DataAnalysis {
    ArrayList<Movie> movies = ReadFile.readFileIntoMovieObjects();
    Random random = new Random();

    public String getFirst(){
        return movies.get(0).getTitle();
    }

    public String getRandom(){
        int randomNumber = random.nextInt(movies.size());

        return movies.get(randomNumber).getTitle();
    }

    public String getTenSortByPopularity(){
        ArrayList<Movie> tenRandomMovies = new ArrayList<Movie>();
        for (int i = 0; i < 10; i++) {
            tenRandomMovies.add(movies.get(random.nextInt(movies.size())));
        }

        Collections.sort(tenRandomMovies);
        Collections.reverse(tenRandomMovies);


        return tenRandomMovies.toString();
    }

    public int howManyWonAnAward(){
        int howManyWonAnAward = 0;

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getAward().equals("Yes")){
                howManyWonAnAward++;
            }
        }
        return howManyWonAnAward;
    }

}
