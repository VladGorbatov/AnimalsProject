package org.example;

class Animal {
    private String name;
    private String type;
    private int age;
    private double weight;
    private String country;
    private String color;
    private String zooName;

    public Animal(String name, String type, int age, double weight, String country, String color, String zooName) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.country = country;
        this.color = color;
        this.zooName = zooName;
    }

    public Animal() {
        this("Имя неизвестно", "Вид неизвестен", 0, 0, "Страна происхождения неизвестна", "Окрас неизвестен", "Место содержания неизвестно");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", zooName='" + zooName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }
}