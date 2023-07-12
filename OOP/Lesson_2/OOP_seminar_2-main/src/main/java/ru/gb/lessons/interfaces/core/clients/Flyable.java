package ru.gb.lessons.interfaces.core.clients;

public interface Flyable {
    int fly();
}
public class Duck extends WildAnimal implements Flyable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 7 км/ч");
        return 7;
    }

}