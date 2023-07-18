package OOP.Lesson_2.OOP_seminar_2-main.bin.main.ru.gb.lessons.interfaces.core.drugStore;

public class ComponentIterator implements Iterator<Component> {
    List<Component> components = new ArrayList<>();
    int componentsCount = 0;
    public Component next() {
        return components.get(componentsCount++);
    }

    public boolean hasNext() {
        return componentsCount < components.size();
    }
}