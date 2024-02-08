package Hm;

import client.*;
import medicines.Component;
import medicines.Medicine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
        pike.fly(0);
        pike.toGo(0);
        pike.swim(100);

        Animal kitoglav = new Kitoglav("«Мишаня»", new Owner("Екатерина Оплевулька"),
                LocalDate.of(2024, 6, 5), new Illness("Сломал клюв"), 0);

        System.out.println();
        System.out.println(kitoglav);
        kitoglav.fly(100);
        kitoglav.toGo(50);
        kitoglav.swim(0);


        Medicine m1 = new Medicine();
        Medicine m2 = new Medicine();
        Medicine m3 = new Medicine();

        m1.addComp(new Component("Solution", 72, 62));
        m1.addComp(new Component("Decongestant spray", 78, 122));
        m2.addComp(new Component("Eye drops", 90, 42));
        m2.addComp(new Component("Capsule", 97, 10));
        m3.addComp(new Component("Antiseptic", 99, 99));
        m3.addComp(new Component("Aspirins", 91, 12));

        System.out.println();
        List<Medicine> medicines = new ArrayList<>();
        medicines.add(m1);
        medicines.add(m3);
        medicines.add(m2);

        System.out.println(medicines);

        Collections.sort(medicines);

        System.out.println(medicines);
    }
}

