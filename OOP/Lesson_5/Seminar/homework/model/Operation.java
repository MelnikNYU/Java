package OOP.Lesson_5.Seminar.homework.model;

import java.util.List;

public interface Operation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
