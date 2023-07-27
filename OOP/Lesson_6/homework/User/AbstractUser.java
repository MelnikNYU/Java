package OOP.Lesson_6.homework.User;

public class AbstractUser {
    private User user;
    
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
