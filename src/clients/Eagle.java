package clients;
import java.time.LocalDate;
public class Eagle extends Animal{
    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Eagle(){
        super();
    }

    public void moveByJumping(int meters){
        System.out.print("Орёл по имени " + nickName + " переместился прыжками " + meters + " метров. Статистика подвижности: ");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }

    @Override
    public void toGo(int meters) {
        System.out.print("Орёл " + nickName + " умело летает. Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
    }

    @Override
    public void swim(int meters){
        System.out.print("Орёл по имени " + nickName + " не плавает! Статистика подвижности: ");
        int result = movementStatistics;
        System.out.println(result);
    }
}
