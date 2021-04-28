package com.model;

import java.util.*;

public class Main {

    private ArrayList<Character> withoutRole;
    private ArrayList<Character> playWith;
    private String muchMore;

    private final ArrayList<Cinema> allCinemas;

    public Main() {
        //DATABASE
        CinemaDataBase Films = new CinemaDataBase();

        //CREATING 3 NEW FILMS
        Cinema star_wars = new Cinema("Star Wars: A New Hope");
        Cinema matrix = new Cinema("Matrix");
        Cinema inception = new Cinema("Inception");

        //CREATING CHARACTERS

        //StarWars
        Character mark_hamill = new Character("Mark Hamill");
        Character harrison_ford = new Character("Harrison Ford");

        //Matrix
        Character keanu_reeves = new Character("Keanu Reeves");
        Character laurence_fishburne = new Character("Laurence Fishburne");
        Character hugo_weaving = new Character("Hugo Weaving");


        //Inception
        Character leonardo_diCaprio = new Character("Leonardo DiCaprio");
        Character tom_hardy = new Character("Tom Hardy");
        Character elliot_page = new Character("Elliot Page");
        Character cillian_murphy = new Character("Cillian Murphy");

        //EXTRA CHARACTERS
        Character jared_leto = new Character("Jared Leto");
        Character joaquin_phoenix = new Character("Joaquin Phoenix");

        //ADDING FILM AND ACTORS TO FILMS
        Films.addCinema(star_wars);
        Films.addCinema(matrix);
        Films.addCinema(inception);

        Films.addCharacter(mark_hamill);
        Films.addCharacter(harrison_ford);

        Films.addCharacter(keanu_reeves);
        Films.addCharacter(laurence_fishburne);
        Films.addCharacter(hugo_weaving);

        Films.addCharacter(leonardo_diCaprio);
        Films.addCharacter(tom_hardy);
        Films.addCharacter(elliot_page);
        Films.addCharacter(cillian_murphy);


        Films.addCharacter(jared_leto);
        Films.addCharacter(joaquin_phoenix);

        //ADDING ACTORS TO STARWARS
        star_wars.addCharacter(mark_hamill);
        star_wars.addCharacter(harrison_ford);
        //ADDING ACTORS TO MATRIX
        matrix.addCharacter(keanu_reeves);
        matrix.addCharacter(laurence_fishburne);
        matrix.addCharacter(hugo_weaving);
        //ADDING ACTORS TO INCEPTION
        inception.addCharacter(leonardo_diCaprio);
        inception.addCharacter(tom_hardy);
        inception.addCharacter(elliot_page);
        inception.addCharacter(cillian_murphy);


        //ADDING CINEMAS TO ACTOR
        mark_hamill.addCinema(star_wars);
        harrison_ford.addCinema(star_wars);
        keanu_reeves.addCinema(matrix);
        hugo_weaving.addCinema(matrix);
        laurence_fishburne.addCinema(matrix);
        leonardo_diCaprio.addCinema(inception);
        tom_hardy.addCinema(inception);
        elliot_page.addCinema(inception);
        cillian_murphy.addCinema(inception);


        withoutRole = Tasks.characterWithoutCinemas(Films);
        playWith = Tasks.characterWhichPlayWith(tom_hardy);
        muchMore = Tasks.maxCountOfCharacters(Films).getCinemaTitle();
        allCinemas = (ArrayList<Cinema>) Films.getAllCinemas();

    }

    public ArrayList<Character> getWithoutRole() {
        return withoutRole;
    }

    public ArrayList<Character> getPlayWith() {
        return playWith;
    }

    public String getMuchMore() {
        return muchMore;
    }

    public ArrayList<Cinema> getAllCinemas() {
        return allCinemas;
    }

}
