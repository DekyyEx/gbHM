package client;
import Action.Goable;

import java.time.LocalDate;
public class Cat extends Animal implements Goable {
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }

    @Override
    public void toGo(int meters) {
        System.out.print("Котёнок по имени " + nickName + " прошёл " + meters + " метров. Статистика подвижности: ");
        System.out.println(movementStatistics + meters);
    }

    @Override
    public void fly(int meters) {
        System.out.print("Котёнок по имени " + nickName + " не может летать! Статистика подвижности: ");
        System.out.println(movementStatistics);
    }

    @Override
    public void swim(int meters){
        System.out.print("Котёнок по имени " + nickName + " не любит воду и убежал. Статистика подвижности: ");
        System.out.println(movementStatistics);
    }

    @Override
    public double run() {
        return 75;
    }
}
