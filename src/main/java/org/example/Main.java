package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File lsitAnimals = new File("C:\\Users\\vladg\\Documents\\Animals\\src\\main\\resources\\listAnimals.json");
        Animal animal = mapper.readValue(lsitAnimals, Animal.class);

        System.out.println(animal);
    }
}

