package OOP.Lesson_6.homework.Updater;

import OOP.Lesson_6.homework.User.User;

public class Updater implements UpdateName {
    private User user;

    @Override
    public User update(User user,String name) {
        User updater = new User(name);
        this.user = updater;
        update();
        return updater;
    }
    private void update(){
        System.out.println("Update user: " + user.getName());
    }
}
