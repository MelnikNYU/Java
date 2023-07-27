package OOP.Lesson_5.Seminar.homework;

import OOP.Lesson_5.Seminar.homework.Repository.Repository;
import OOP.Lesson_5.Seminar.homework.View.UserView;
import OOP.Lesson_5.Seminar.homework.controller.ControllerUser;
import OOP.Lesson_5.Seminar.homework.mapper.UserMapper;
import OOP.Lesson_5.Seminar.homework.model.Operation;
import OOP.Lesson_5.Seminar.homework.utils.Validate;

public class Main {
    public static void main(String[] args) {
        Operation Operation = new Operation("users.txt");
        Repository repository = new Repository(Operation, new UserMapper());
        Validate validate = new Validate();
        ControllerUser controller = new ControllerUser(repository, validate);
        UserView view = new UserView(controller, validate);
        view.run();
    }
}
