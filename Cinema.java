package com.model;

import java.util.*;

public class Cinema {

    private final String cinemaTitle;
    private final ArrayList<Character> charactersFromCinema;

    public Cinema(String cinemaTitle) {
        this.cinemaTitle = cinemaTitle;
        charactersFromCinema = new ArrayList<>();
    }


    public String getCinemaTitle() {
        return cinemaTitle;
    }

    public List<Character> getCharactersFromCinema() {
        return charactersFromCinema;
    }
    public void addCharacter(Character character) {
        charactersFromCinema.add(character);
    }


}
