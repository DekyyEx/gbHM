package client;
import Action.Goable;

import java.time.LocalDate;
public class Dog extends Animal implements Goable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

    @Override
    public void fly(int meters) {
        System.out.print("Собака по имени " + nickName + " не может летать :((((. Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
    }

    @Override
    public double run() {
        return 60;
    }
}
