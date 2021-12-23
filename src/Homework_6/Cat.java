package Homework_6;

public class Cat extends Animal {

    public Cat(String species, int limitOnRunning, int limitOnSwimming) {
        super(species, limitOnRunning, limitOnSwimming);
        catCount++;
    }

    @Override
    public void swim(float distance) {
        System.out.println("cats can't swim");;
    }
}
