package client;

import Action.Flyable;
import Action.Swimable;

import java.time.LocalDate;

public class Kitoglav extends Animal implements Flyable {
        Double discount;

        public Kitoglav(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
            super(nickName, owner, birthDate, illness, movementStatistics);
            this.discount = discount;
        }

        public Kitoglav() {
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
            System.out.print("Птица по имени " + nickName + " пролетела " + meters + " метров. Статистика подвижности: ");
            System.out.println(movementStatistics + meters);
        }
        @Override
        public void fly(int meters) {
            System.out.print("Птица по имени " + nickName + " не может плавать! Статистика подвижности: ");
            System.out.println(movementStatistics);

        }
        @Override
        public void swim(int meters){
            System.out.print("Птица по имени " + nickName + " любит кушать. Статистика подвижности: ");
            System.out.println(movementStatistics);
        }
        @Override
        public double run() {
            return 75;
        }
    }
