package Hm;

import client.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("«Марусенька»", new Owner("Ольга Радиковна"),
                LocalDate.of(2011, 8, 3), new Illness("Блохи"), 0.5, 10);

        Animal dog = new Dog("«Руби»", new Owner("Владимир Владимирович"),
                LocalDate.of(2020, 10, 5), new Illness("Царапина"), 0);

        System.out.println();
        System.out.println(cat);
        cat.toGo(10);
        cat.swim(5);
        cat.fly(100);

        System.out.println();
        System.out.println(dog);
        dog.toGo(10);
        dog.fly(100);
        dog.swim(3);
        System.out.println();

        Eagle Eagle = new Eagle("«Баунти»", new Owner("Игорь Васильевич"),
                LocalDate.of(2021, 10, 4), new Illness("Сломал лапку"), 0);

        System.out.println();
        System.out.println(Eagle);
        Eagle.fly(100);
        Eagle.toGo(50);
        Eagle.swim(20);

        Animal dropfish = new Dropfish("«Поньо»", new Owner("Сергей Муртыга"),
                LocalDate.of(1020, 10, 5), new Illness("Порез"), 0);

        System.out.println();
        System.out.println(dropfish);
        dropfish.fly(0);
        dropfish.toGo(0);
        dropfish.swim(100);

        Animal pike = new Pike("«Пинокио»", new Owner("Алексей Фурышка"),
                LocalDate.of(2020, 10, 5), new Illness("Порез"), 0);

        System.out.println();
        System.out.println(pike);
        dropfish.fly(0);
        dropfish.toGo(0);
        dropfish.swim(100);

        Animal kitoglav = new Kitoglav("«Мишаня»", new Owner("Екатерина Оплевулька"),
                LocalDate.of(2024, 6, 5), new Illness("Сломал клюв"), 0);

        System.out.println();
        System.out.println(kitoglav);
        dropfish.fly(100);
        dropfish.toGo(50);
        dropfish.swim(0);

    }
}

