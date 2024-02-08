package personal;

public abstract class Personal {
    protected String name;
    protected String profession;
    protected String day;

    public Personal() {
    }

    public Personal(String name, String profession, String day) {
        this.name = name;
        this.profession = profession;
        this.day = day;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
    public void toDo() {
        System.out.println(getClass().getSimpleName() + " проводит манипуляции");
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
