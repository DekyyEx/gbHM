package Hm;

import clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("«Марусенька»", new Owner("Ольга Радиковна"),
                LocalDate.of(2011, 8, 3), new Illness("Блохи"), 0.5, 10);

        Animal dog = new Dog("«Руби»", new Owner("Владимир Владимирович"),
                LocalDate.of(2020, 10, 5), new Illness("Царапина"), 0);

        System.out.println();
        System.out.println("ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ");
        System.out.println(cat);
        cat.toGo(10);
        cat.swim(5);
        cat.fly(100);

        System.out.println();
        System.out.println("ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ฅ՞•ﻌ•՞ฅ ");
        System.out.println(dog);
        dog.toGo(10);
        dog.fly(100);
        dog.swim(3);
        System.out.println();

        Eagle Eagle = new Eagle("«Баунти»", new Owner("Игорь Васильевич"),
                LocalDate.of(2021, 10, 4), new Illness("Сломал лапку"), 0);


        System.out.println("꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱꒰ঌ( •ө• )໒꒱꒰ঌ( •ө• )໒꒱ ꒰ঌ( •ө• )໒꒱");
        System.out.println(Eagle);
        Eagle.fly(100);
        Eagle.toGo(50);
        Eagle.swim(20);


    }
}

