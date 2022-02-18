package com.example.movieworksshop.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static ArrayList<Movie> readFileIntoMovieObjects(){
        File movieFile = new File("src/main/java/com/example/movieworksshop/repositories/movies");
        String line = "";
        String[] movieArray = new String[6];
        ArrayList<Movie> movieArrayList = new ArrayList<Movie>();

        try {
            Scanner scanner = new Scanner(movieFile);
            while (scanner.hasNextLine()){

                line = scanner.nextLine();
                movieArray= line.split(";");

                int year = Integer.parseInt(movieArray[0]);
                int length = Integer.parseInt(movieArray[1]);
                String title = movieArray[2];
                String subject = movieArray[3];
                int popularity = Integer.parseInt(movieArray[4]);
                String awards = movieArray[5];

                Movie currentMovie = new Movie(year, length, title, subject, popularity, awards);

                //gememr hvert movie object i arraylisten
                movieArrayList.add(currentMovie);

            }
        } catch (FileNotFoundException e){
            System.out.println("filen blev ikke fundet");
        }
        return movieArrayList;
    }
}