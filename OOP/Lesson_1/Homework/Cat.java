package OOP.Lesson_1.Homework;

import java.util.Arrays;

public class Cat extends Animal {
    String type = "cat";
    Boolean run = true;
    Boolean fly = false;
    Boolean swim = true;
    
    public Cat(String name, String color, Integer age, String vaccination,
            String species, Integer legsCount, String type, Boolean run, Boolean fly, Boolean swim) {
        super(name, color, age, vaccination, species, legsCount, type, run, fly, swim);

    }

    
    // private void FIndFood() {
    //     System.out.println("Cat found food ");
    // }

    // private void FIndFood(int... args) {
    //     System.out.println("Cat found food, count = " + Arrays.toString(args));
    // }

    // private void WakeUp() {
    //     System.out.println("Cat woke up ");
    // }

    // private void Sleep() {
    //     System.out.println("Cat sleeps ");
    // }

    // private void Eat() {
    //     System.out.println("Cat ate ");
    // }

    // public void Hunt(int... args) {
    //     WakeUp();
    //     FIndFood(args);
    //     Eat();
    //     Sleep();
    // }
}
