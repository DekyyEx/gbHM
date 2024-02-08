package client;
import Action.Flyable;
import Action.Goable;

import java.time.LocalDate;
public class Eagle extends Animal implements Flyable {
    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Eagle(){
        super();
    }

    public void moveByJumping(int meters){
        System.out.print("Орёл по имени " + nickName + " переместился прыжками " + meters + " метров. Статистика подвижности: ");
        System.out.println(movementStatistics + meters);
    }

    @Override
    public void toGo(int meters) {
        System.out.print("Орёл " + nickName + " умело летает. Статистика подвижности: ");
        System.out.println(movementStatistics);
    }

    @Override
    public void swim(int meters){
        System.out.print("Орёл по имени " + nickName + " не плавает! Статистика подвижности: ");
        System.out.println(movementStatistics);
    }

    @Override
    public double run() {
        return 90;
    }
}
