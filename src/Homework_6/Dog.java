package Homework_6;

public class Dog extends Animal {

    public Dog(String species, int limitOnRunning, int limitOnSwimming) {
        super(species, limitOnRunning, limitOnSwimming);
        dogCount++;
    }

    @Override
    public void swim(float distance) {
        if (distance > limitOnSwimming) {
            System.out.println("dog can't swim so far: " + distance + "m");
        } else {
            System.out.println("dog swam " + distance + "m");
        }
    }
}
