package OOP.Lesson_1.Homework;

public class Swan extends Animal {

    String type = "swan";
    Boolean run = true;
    Boolean fly = true;
    Boolean swim = true;

    public Swan(String name, String color, Integer age, String type, Boolean run, Boolean fly, Boolean swim) {

        super(name, color, age, type, run, fly, swim);
        this.type = type;
        this.run = true;
        this.fly = fly;
        this.swim = swim;
    }

    public Swan(String name, Integer age) {

        super(name, age);
        this.type = "swan";
        this.run = true;

    }

}
