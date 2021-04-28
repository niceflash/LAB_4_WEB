package com.model;

import java.util.*;

public class Tasks {
    //TASK 1 : Визначити, чи є актор, який не зіграв в жодному фільмі
    public static ArrayList<Character> characterWithoutCinemas(CinemaDataBase cinemaDataBase) {

        ArrayList<Character> resultList = new ArrayList<>();

        for (Character character: cinemaDataBase.getAllCharacters()) {
            Iterator<Cinema> cinemaIterator = cinemaDataBase.getAllCinemas().iterator();

            boolean present = false;
            while (cinemaIterator.hasNext()) {
                Cinema cinema = cinemaIterator.next();
                if (cinema.getCharactersFromCinema().contains(character)) {
                    present = true;
                    break;
                }
            }

            if (!present) {
                resultList.add(character);
            }
        }
        return resultList;
    }

    //TASK 2 : Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
    public static ArrayList<Character> characterWhichPlayWith(Character character) {

        ArrayList<Character> charactersList = new ArrayList<>();

        for (Object object1 : character.getCinemasWithCharacters()) {
            if (object1 instanceof Cinema) {
                Cinema cinema = (Cinema) object1;
                for (Object object2 : cinema.getCharactersFromCinema()) {
                    if (object2 instanceof Character) {
                        Character character1 = (Character) object2;
                        if (!character1.getCharactersName().equals(character.getCharactersName())) {
                            charactersList.add(character1);
                        }
                    }
                }
            }
        }

        return charactersList;
    }

    //TASK 3 : Знайти фільм з найбільшою  кількістю акторів
    public static Cinema maxCountOfCharacters(CinemaDataBase cinemaDataBase) {
        Cinema cinema0 = cinemaDataBase.getAllCinemas().get(0);
        for (Cinema cinemas : cinemaDataBase.getAllCinemas()) {
            int length = cinema0.getCharactersFromCinema().size();
            if (cinemas.getCharactersFromCinema().size() > length) {
                cinema0 = cinemas;
            }
        }
        return cinema0;
    }
}
