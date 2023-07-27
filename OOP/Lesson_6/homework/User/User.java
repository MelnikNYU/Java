package OOP.Lesson_6.homework.User;

public class User extends AbstractUser{
    protected String name;
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
