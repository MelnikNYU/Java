package OOP.Lesson_1.Homework;

import OOP.Lesson_1.Homework.Owner;

public class Animal {
    private String name;
    private Integer age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;
    private Boolean run;
    private Boolean fly;
    private Boolean swim;
    private String type;

    public Animal(String name, Integer age, String vaccination, String color,
            String species, Owner owner, Integer legsCount, Boolean run, Boolean fly, Boolean swim) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.run = run;
        this.fly = fly;
    }

    public Animal(String name, String color, Integer age, String vaccination, String species, Integer legsCount,
            String creature, Boolean run, Boolean fly, Boolean swim) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.run = run;
        this.color = color;
        this.fly = fly;
        this.swim = swim;
        this.vaccination = vaccination;
        this.species = species;
        this.legsCount = legsCount;
    }

    public Animal(String name, String color, Integer age, String type, Boolean run, Boolean fly, Boolean swim) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.run = run;
        this.color = color;
        this.fly = fly;
        this.swim = swim;
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void toRun() {

        if (this.run) {
            System.out.println(this.type + " " + this.name + ": \"run\" ");
        } else {
            System.out.println("stand ");
        }

    }

    public void toFly() {

        if (this.fly) {
            System.out.println(this.type + " " + this.name + ": \"I'm fly\" ");
        } else {
            System.out.println(this.type + " " + this.name + ": \"fly :-(\" ");
        }

    }

    public void toSwim() {

        if (this.swim) {
            System.out.println(this.type + " " + this.name + ": \"I'm swim\" ");
        } else {
            System.out.println(this.type + " " + this.name + ": \"Swim\" ");
        }

    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
}
