package OOP.Lesson_1.Homework;

public class Dog extends Animal{
    String type = "dog";
    Boolean run = true;
    Boolean fly = false;
    Boolean swim = true;

    public Dog(String name, String color, Integer age, String vaccination,
            String species, Integer legsCount, String type, Boolean run, Boolean fly, Boolean swim) {
        super(name, color, age, vaccination, species, legsCount, type, run, fly, swim);

        
    }
    
}
