package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Animal tiger = new Animal("Тигрюша", "Тигр", 5, 85.5, "Россия", "Золотой", "Государственный зоопарк");

        String dataAnimal = mapper.writeValueAsString(tiger);
        System.out.println(dataAnimal);
    }
}

