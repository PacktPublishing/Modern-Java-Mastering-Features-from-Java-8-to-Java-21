package com.modernjava.patternmatching.recordmatch;

public class AnimalService {

    public String retrieveName(Animal animal){
        return switch (animal){
            case null -> ""; // This handles the null pointer exception.
            case Cat cat -> cat.name();
            case Dog dog -> dog.name();
        };

    }

}
