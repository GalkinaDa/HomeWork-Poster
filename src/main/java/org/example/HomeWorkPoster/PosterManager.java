package org.example.HomeWorkPoster;

public class PosterManager {
    private String[] movies = new String[0];
    private String film1 = "Бладшот";
    private String film2 = "Вперед";
    private String film3 = "Отель Белград";
    private String film4 = "Джентельмены";
    private String film5 = "Человек-невидимка";
    private String film6 = "Тролли. Мировой тур";
    private String film7 = "Номер один";
    private int limit;

    public PosterManager () {
        this.limit = 5;
    }

    public PosterManager (int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie){
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies [i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String [] findAll () {
        return movies;
    }

    public String [] findLast () {
        int resultLength;
        if (movies.length < limit){
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - i - 1];
        }
        return tmp;
    }
}
