package personal;

public class Nurse extends Personal implements NonCures {
    public Nurse() {
        super();
    }

    public Nurse(String name, String profession, String day) {
        super(name, profession, day);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void nonCures() {

    }

    @Override
    public String getNonCure() {
        return "Это не врачи";
    }
    public void toDo() {
        System.out.println(getName() + " плставит укол");
    }
}
