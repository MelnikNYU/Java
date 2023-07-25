package OOP.Lesson_5.Seminar.homework;

import OOP.Lesson_5.Seminar.homework.Repository.Repository;
import OOP.Lesson_5.Seminar.src.notebook.controller.UserController;
import OOP.Lesson_5.Seminar.src.notebook.dao.impl.FileOperation;

public class Main {
    public static void main(String[] args) {
        Operation Operation = new Operation("users.txt");
        Repository repository = new Repository(Operation, new UserMapper());
        Validate validate = new Validate();
        ControllerUser controller = new ControllerUser(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
