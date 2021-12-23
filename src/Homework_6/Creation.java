package Homework_6;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
  2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
  4. * Добавить подсчет созданных котов, собак и животных.*/

public class Creation {

    public static void main(String[] args) {
        Cat cat = new Cat("cat", 200, 0);
        Dog dog = new Dog("dog", 500, 10);

        cat.run(201);
        cat.swim(0);
        dog.run(500);
        dog.swim(11);

        System.out.println("Total amount of animals: " + Animal.totalCount);
        System.out.println("Total amount of cats: " + Cat.catCount);
        System.out.println("Total amount of dogs: " + Dog.dogCount);
    }
}