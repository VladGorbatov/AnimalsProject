package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        Animal tiger = new Animal();
        tiger.name = "Тигрюша";
        tiger.type = "Тигр";
        tiger.age = 5;
        tiger.weight = 85.5;

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String jsonAnimal = mapper.writeValueAsString(tiger);
        System.out.println(jsonAnimal);
*/
        String jsonString = "{\"name\":\"Тигрюша\"," +
                "\"type\":\"Тигр\"," +
                "\"age\":5," +
                "\"weight\":85.5}";
        Animal tiger = new ObjectMapper().readValue(jsonString, Animal.class);
        System.out.println(tiger);
    }
}

class Animal {
    public String name;
    public String type;
    public int age;
    public double weight;

    public String toString() {
        return "Animal [name=" + name + ", type=" + type + ", age=" + age + ", weight=" + weight + '}';
    }
}
