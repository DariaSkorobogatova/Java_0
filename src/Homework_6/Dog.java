package Homework_6;

public class Dog extends Animal {

    public Dog(String species) {
        super(species);
        this.limitOnRunning = 500;
        this.limitOnSwimming = 10;
        dogCount++;
    }

    @Override
    public void swim(float distance) {
        if (distance > limitOnSwimming) {
            System.out.println("dogs can't swim so far: " + distance + "m");
        } else {
            System.out.println("dog swam " + distance + "m");
        }
    }
}
