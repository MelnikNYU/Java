package OOP.Lesson_5.Seminar.homework.Repository;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void UpdateUser(User user, Fields field, String param);

    void deleteUser(User user);
}