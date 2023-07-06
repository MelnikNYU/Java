package java_projects.lesson_6.homework;

//  множество коллекций Set
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class task_1 {
    private String brand;
    private Integer HDD;
    private String model;
    private Integer RAM;
    private Integer id;
    private String color;
    private String OS;
    private boolean isBooked = false;

    public task_1( String model, Integer id, String brand) {
        this.model = model;
        this.brand = brand;
        this.id = id;
        System.out.println("Марки ноутбуков " + "'" + this.brand + "'" + " Модели " + this.model + "Id "
                + Integer.toString(this.id));
    }

    public String getColor() {
        return this.color;
    }

    public Integer getRAM() {
        return this.RAM;
    }

    public String getOS() {
        return this.OS;
    }

    public Integer getHDD() {
        return this.HDD;
    }

    public Integer getid() {
        return this.id;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public Boolean getBooking() {
        return this.isBooked;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public void Book() {
        if (isBooked == false) {
            this.isBooked = true;
        } else
            System.out.println("Зарезервирован ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS " + this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD " + this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM " + this.RAM);
        sb.append(System.lineSeparator());
        if (this.isBooked == false)
            sb.append("На складе ");
        else
            sb.append("Резерв ");

        return (sb.toString());
    }

}
