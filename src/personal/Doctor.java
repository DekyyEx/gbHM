package personal;
import java.time.LocalDate;
public class Doctor extends Personal implements Curse{
    public Doctor() {
        super();
    }

    public Doctor(String name, String profession, String day) {
        super(name, profession, day);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void cure() {

    }
    public String getCure() {
        return "Проводит операции";
    }

    @Override
    public void toDo() {
        System.out.println(getName() + " может проводить операции");
    }
}
