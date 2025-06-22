package org.example.HomeWorkPoster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {


    @Test
    public void shouldFindAll() {
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd() {
        PosterManager manager = new PosterManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film6");
        manager.addMovie("film7");

        String[] expected = {"film1", "film2", "film6", "film7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind4Last() {
        PosterManager manager = new PosterManager(4);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film6");
        manager.addMovie("film7");

        String[] expected = {"film7", "film6", "film4", "film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind1Last() {
        PosterManager manager = new PosterManager(1);
        manager.addMovie("film2");
        manager.addMovie("film7");


        String[] expected = {"film7"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind2Last() {
        PosterManager manager = new PosterManager(1);
        manager.addMovie("film2");


        String[] expected = {"film2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFind5Last() {
        PosterManager manager = new PosterManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film6");
        manager.addMovie("film7");

        String[] expected = {"film7", "film6", "film4", "film3", "film2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll10() {
        PosterManager manager = new PosterManager(10);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");
        manager.addMovie("film8");
        manager.addMovie("film9");
        manager.addMovie("film10");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager(1);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");
        manager.addMovie("film8");
        manager.addMovie("film9");
        manager.addMovie("film10");


        String[] expected = {"film10"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind10Last() {
        PosterManager manager = new PosterManager(10);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");
        manager.addMovie("film8");
        manager.addMovie("film9");
        manager.addMovie("film10");


        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind9LastFrom10() {
        PosterManager manager = new PosterManager(9);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");
        manager.addMovie("film8");
        manager.addMovie("film9");
        manager.addMovie("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind9Last() {
        PosterManager manager = new PosterManager(9);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");
        manager.addMovie("film8");
        manager.addMovie("film9");

        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}


