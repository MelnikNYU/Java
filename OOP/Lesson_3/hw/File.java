package OOP.Lesson_3.hw;

public abstract class File {
    public String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

