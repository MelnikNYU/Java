package OOP.Lesson_5.Seminar.homework.controller;



import java.util.List;

import OOP.Lesson_5.Seminar.homework.User;
import OOP.Lesson_5.Seminar.homework.Repository.Repository;
import OOP.Lesson_5.Seminar.homework.model.Fields;
import OOP.Lesson_5.Seminar.homework.utils.Validate;

public class ControllerUser {
    private Repository repository;
    private Validate validate;
    public void UserController(Repository repository, Validate validate) {
        this.repository = repository;
        this.validate = validate;
    }

    public void saveUser(User user) throws Exception {
        validate.checkNumber(user.getPhone());
        repository.CreateUser(user);
    }

    public void deleteUser(String userId) throws Exception{
        List<User> users = repository.getAllUsers();
        User userFind = null;
        for (User user : users) {
            if (user.getId().equals(userId)) {
                userFind = user;
                break;
            }
        }

        if (userFind == null){
            throw new Exception("User not found");
        }

        repository.deleteUser(userFind);

    }

    public void updateUser(User user, Fields field, String param) throws Exception {
        if(field == Fields.TELEPHONE) {
            validate.checkNumber(param);
        }
        repository.UpdateUser(user, field, param);

    }
    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }
    public List<User> getUsers() throws Exception {
        return repository.getAllUsers();
    }
}