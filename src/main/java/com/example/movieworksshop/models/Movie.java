package com.example.movieworksshop.models;

public class Movie implements Comparable<Movie>{
    private int year;
    private int lenght;
    private String title;
    private String subject;
    private int popularity;
    private String award;

    public Movie(int year, int lenght, String title, String subject, int popularity, String award) {
        this.year = year;
        this.lenght = lenght;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.award = award;
    }

    public String getTitle() {
        return title;
    }

    public String getAward() {
        return award;
    }

    @Override
    public String toString() {
        return "title= " + title +
                ", popularity= " + popularity;
    }

    @Override
    public int compareTo(Movie movie) {
        if (popularity < movie.popularity){
            return -1;
        } else if (popularity > movie.popularity){
            return 1;
        } else {
            return 0;
        }
    }
}
