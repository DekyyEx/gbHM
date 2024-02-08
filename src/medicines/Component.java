package medicines;

public class Component {
    String title;
    int power;
    int weight;

    public Component(String title, int power, int weight) {
        this.title = title;
        this.power = power;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Component{" +
                "title='" + title + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                '}';
    }
}
