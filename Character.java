package com.model;

import java.util.*;

public class Character {
    private final String charactersName;
    private final ArrayList<Cinema> cinemasWithCharacters;

    public Character(String charactersName) {
        this.charactersName = charactersName;
        cinemasWithCharacters = new ArrayList<>();
    }

    public String getCharactersName() {
        return charactersName;
    }

    public List<Cinema> getCinemasWithCharacters() {
        return cinemasWithCharacters;
    }

    public void addCinema(Cinema cinema) {
        cinemasWithCharacters.add(cinema);
    }

}
