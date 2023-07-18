package OOP.Lesson_2.OOP_seminar_2-main.bin.main.ru.gb.lessons.interfaces.core.DrugHW;

import java.util.Iterator;
import java.util.List;

public abstract class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    int index;

    public Pharmacy(List<Component> components) {
        this.components = components;
        this.index = 0;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }


    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n",
                this.getClass().getSimpleName(),
                components, getDrugPower());
    }

    @Override
    public int compareTo(Pharmacy o) {
        int power = getDrugPower();
        int comparison1 = Integer.compare(power, o.getDrugPower());

        return comparison1 == 0 ? compareComponents(o.components) : comparison1;
    }

    public int compareComponents(List<Component> componentsToCompare) {
        int comparedLess = 0;
        int comparedMore = 0;
        for (Component c: this.components) {
            for (Component c1: componentsToCompare) {
                if (c.compareTo(c1) < 0) comparedLess++;
                else if (c.compareTo(c1) > 0) comparedMore++;
            }
        }
        return Integer.compare(comparedMore, comparedLess);
    }
}
