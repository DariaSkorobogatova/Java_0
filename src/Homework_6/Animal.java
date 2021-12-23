package Homework_6;

public abstract class Animal {

    protected String species;
    protected int limitOnRunning;
    protected int limitOnSwimming;
    static int totalCount;
    static int catCount;
    static int dogCount;

    public Animal(String species) {
        this.species = species;
        totalCount++;
    }

    public void run(float distance) {
        if (distance > limitOnRunning) {
            System.out.println(species + " can't run so far: " + distance + "m");;
        } else {
            System.out.println(species + " ran " + distance + "m");
        }
    }

    public abstract void swim(float distance);
}
