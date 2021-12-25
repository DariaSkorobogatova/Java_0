package Homework_6;

public class Cat extends Animal {

    public Cat(String species) {
        super(species);
        this.limitOnRunning = 200;
        this.limitOnSwimming = 0;
        catCount++;
    }

    @Override
    public void swim(float distance) {
        System.out.println("cats can't swim");;
    }
}
