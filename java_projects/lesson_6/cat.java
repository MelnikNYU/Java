package java_projects.lesson_6;

// Реализовать класс Cat для вет. клиники
// Добавить в него поля:
// Имя, возраст, Привит ли кот (boolean), дефолт - false, пол
// Добавить методы:
// Кот Имя мяукнул n раз
// Прививка кота, если был привит - сообщить об этом
// Так же придумать 1-2 своих метода

public class cat {
    String name = "";
    Integer age;
    Boolean vaccin = false;
    Boolean sex = false;
    Integer lives_limit = 2;
    Integer Meows = 0;

    public int car_accident() {
        if (lives_limit != 0) {
            lives_limit--;
        }
        if (lives_limit == 0) {
            System.out.println(" R.I.P");
        }
        return lives_limit;
    }

    public void vaccine() {
        if (!vaccin) {
            this.vaccin = true;
            System.out.println(this.name + " IS vaccinated! PAY! ");
        } else {
            System.out.println(this.name + " IS vaccinated! FEED! ");
        }
    }
    public void spring(int quantaty) {
        this.Meows = quantaty;
        System.out.println("Cat " + this.name + " meows " + Meows + " times");;
    }
}
