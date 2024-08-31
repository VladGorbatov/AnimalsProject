package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File listAnimals = new File("listAnimals.json");
        Animal animal = objectMapper.readValue(listAnimals, Animal.class);

        System.out.println(animal+"\n");

        Map<String, Object> map = objectMapper.readValue(listAnimals, new TypeReference<Map<String, Object>>() {
        });

        for(String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

