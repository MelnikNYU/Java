package OOP.Lesson_2.OOP_seminar_2

import ru.gb.lessons.interfaces.core.personal.Doctor;

-main.bin.main.ru.gb.lessons.interfaces.core.personal;

public class main {
    public static void main(String[] args) {
        System.out.println();
        Doctor Doc = new Doctor()
        Doc.toheal();
        Doc.tomakeAnInjection();
        Doc.togiveApill();
        Doc.tooperate();

        Nurse Nur = new Nurse()
        Doc.toheal();
        Doc.tomakeAnInjection();
        Doc.togiveApill();
        Doc.tohelpTheDoctor();
    }
}
