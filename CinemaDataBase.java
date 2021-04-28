package com.model;

import java.util.*;

public class CinemaDataBase {
    private List<Cinema> allCinemas;
    private List<Character> allCharacters;

    public CinemaDataBase() {
        allCinemas = new ArrayList<>();
        allCharacters = new ArrayList<>();
    }

    public List<Cinema> getAllCinemas() {
        return allCinemas;
    }

    public List<Character> getAllCharacters() {
        return allCharacters;
    }

    public void addCinema(Cinema cinema) {
        allCinemas.add(cinema);
    }

    public void addCharacter(Character character) {
        allCharacters.add(character);
    }

}
