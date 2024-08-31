package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File listAnimals = new File("listAnimals.json");
        Animal animal = objectMapper.readValue(listAnimals, Animal.class);

        System.out.println(animal);
    }
}

