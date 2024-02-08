package medicines;

import java.util.ArrayList;
import java.util.List;

public class Medicine implements Comparable<Medicine> {
    private List<Component> components = new ArrayList<>();

    public void addComp(Component c) {
        components.add(c);
    }

    public int getFullPower() {
        int fullPowerThis = 0;
        for (Component c : this.components) fullPowerThis += c.getPower();
        return fullPowerThis;
    }
    public int getFullWeight() {
        int weight = 0;
        for (Component c : this.components) weight += c.getWeight();
        return weight;
    }
    @Override
    public int compareTo(Medicine that) {
        return Integer.compare(this.getFullPower(), that.getFullPower());
    }
    @Override
    public String toString() {
        return "Medicine{" +
                "fullPower=" + getFullPower() +
                '}';
    }
}
