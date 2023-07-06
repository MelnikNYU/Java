package java_projects.lesson_6;

// Реализовать класс Cat для вет. клиники
// Добавить в него поля:
// Имя, возраст, Привит ли кот (boolean), дефолт - false, пол
// Добавить методы:
// Кот Имя мяукнул n раз
// Прививка кота, если был привит - сообщить об этом
// Так же придумать 1-2 своих метода

public class sample_2 {
    public static void main(String[] args) {
        cat slon = new cat();
        slon.name = "Слоняра";
        slon.age = 36;
        slon.sex = true;
        System.out.println(slon.lives_limit);
        slon.car_accident();
        System.out.println(slon.lives_limit);
        slon.car_accident();
        slon.vaccine();
        slon.vaccine();
        slon.spring(13);
    }
}
