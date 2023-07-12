package OOP.Lesson_2.OOP_seminar_2-main.bin.main.ru.gb.lessons.interfaces.core.personal;

public class Nurse extends personal {
    String profession = "Nurse";
    Boolean heal = true;
    Boolean makeAnInjection = true;
    Boolean giveApill = true;
    Boolean operate = false;
    Boolean helpTheDoctor = true;

    public Nurse(String name, Integer age, String profession, Integer yearsOfWork,
     Boolean heal, Boolean makeAnInjection, Boolean giveApill, Boolean operate, Boolean helpTheDoctor) {
        super(name, age, profession, yearsOfWork,
     heal, makeAnInjection, giveApill, operate, helpTheDoctor)
     }
}