package OOP.Lesson_6.homework;

import OOP.Lesson_6.homework.Updater.Updater;
import OOP.Lesson_6.homework.User.ReportUser;
import OOP.Lesson_6.homework.User.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Oleg");
        System.out.println(user);

        Updater updater = new Updater();
        user = updater.update(user,"Is no Oleg");
        System.out.println(user);

        ReportUser report = new ReportUser(user);
        report.report();
    }
}
