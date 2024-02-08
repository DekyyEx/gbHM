package client;

import Action.Swimable;

import java.time.LocalDate;

public class Dropfish extends Animal implements Swimable {

        Double discount;

        public Dropfish(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
            super(nickName, owner, birthDate, illness, movementStatistics);
            this.discount = discount;
        }

        public Dropfish() {
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
            System.out.print("Рыба по имени " + nickName + " проплыла " + meters + " метров. Статистика подвижности: ");
            System.out.println(movementStatistics + meters);
        }

        @Override
        public void fly(int meters) {
            System.out.print("Рыба по имени " + nickName + " не может летать! Статистика подвижности: ");
            System.out.println(movementStatistics);
        }

        @Override
        public void swim(int meters){
            System.out.print("Рыба по имени " + nickName + " любит морскую воду. Статистика подвижности: ");
            System.out.println(movementStatistics);
        }

        @Override
        public double run() {
            return 75;
        }
    }


