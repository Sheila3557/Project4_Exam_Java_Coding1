package org.example;

interface AnimalBehaviour {
    void eat();
    void sleep();
    void makeSound();
}
public abstract class Animal implements AnimalBehaviour{
    @Override
    public void eat(){
        System.out.println("Animal is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    @Override
    public void makeSound(){
        System.out.println("Animal is making a sound");
    }
    abstract void displayInformation();

}
class Mammal extends Animal {
    private String breed;
    private String color;
    private double weight;

    Mammal(String breed, String color, double weight) {
        this.breed = breed;
        this.color = color;
        this.weight = weight;

    }

    @Override
    void displayInformation() {
        System.out.println(breed + " " + color + " " + weight);
    }
}
class Bird extends Animal {
    private String breed;
    private String color;
    private double weight;

    Bird(String breed, String color, double weight){
        this.breed=breed;
        this.color=color;
        this.weight=weight;
    }
    @Override
    void displayInformation(){
        System.out.println(breed+ " " + color + " " + weight);
    }
}
class Lion extends Mammal {
    private int age;
    private String built;

    Lion(String breed, String color, double weight) {
        super(breed, color, weight);
    }

    Lion(String breed, String color, double weight, int age, String gender) {
        super(breed, color, weight);
        this.age = age;
        this.built = built;
    }

    @Override
    public void eat() {
        System.out.println("Lion love to eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("LIon sleeps like a cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Roars");
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void body(String built) {
        System.out.println("Lions have " + built);
    }
}
class Elephant extends Mammal {
    Elephant(String breed, String color, double weight) {
        super(breed, color, weight);
    }

    @Override
    public void eat() {
        System.out.println("I eat tons of grass a day");
    }

    @Override
    public void sleep() {
        System.out.println("Elephants sleeps at night");
    }

    @Override
    public void makeSound() {
        System.out.println("I make sound through my trumpet");
    }
}
class Parrot extends Bird {
    Parrot (String breed, String color, double weight){
        super(breed,color,weight);
    }
    @Override
    public void eat(){
        System.out.println("I love eating seeds");
    }
    @Override
    public void sleep(){
        System.out.println("I am a light sleeper");
    }
    @Override
    public void makeSound(){
        System.out.println("Squawk");
    }

}
class ZooEcoSystem {
    public static void main(String[] args) {
        Lion[] lions = {new Lion ("African Lion", "Brown", 250),
                new Lion ("Asiatic Lion", "Sandy Gray", 420)};

        for (Lion lion : lions){
            lion.eat();
            lion.makeSound();
            lion.sleep();
            lion.body("compact bodies");
            System.out.println();
        }
    }

}



