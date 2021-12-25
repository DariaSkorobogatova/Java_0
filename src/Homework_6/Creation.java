package Homework_6;

import java.util.Random;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
  2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
  4. * Добавить подсчет созданных котов, собак и животных.*/

public class Creation {

    static Random rnd = new Random();

    public static void main(String[] args) {

        Cat cat = new Cat("cat");
        Dog dog = new Dog("dog");
        Dog dog2 = new Dog("dog2");

        Animal[] animals = {cat, dog, dog2};
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(rnd.nextInt(600));
            animals[i].swim(rnd.nextInt(20));
            System.out.println();
        }

        System.out.println("Total amount of animals: " + Animal.totalCount);
        System.out.println("Total amount of cats: " + Cat.catCount);
        System.out.println("Total amount of dogs: " + Dog.dogCount);
    }
}