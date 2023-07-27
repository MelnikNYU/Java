package OOP.Lesson_5.Seminar.homework.Repository;

import java.util.List;

import OOP.Lesson_5.Seminar.homework.User;
import OOP.Lesson_5.Seminar.homework.model.Fields;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void UpdateUser(User user, Fields field, String param);

    void deleteUser(User user);
}