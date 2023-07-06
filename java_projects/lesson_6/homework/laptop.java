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


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class laptop {
    private String brand;
    private Integer HDD;
    private String model;
    private Integer RAM;
    private Integer id;
    private String color;
    private String OS;
    private boolean isBooked = false;

    public laptop( String model, Integer id, String brand) {
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


public class laptop {
    public static void main(String[] args) {
        laptop lap1 = new laptop("SD6", 888, "Samsung");
        lap1.setColor("black");
        lap1.setHDD(987);
        lap1.setOS("Windows");
        lap1.setRAM(7);

        laptop lap2 = new laptop("GJY8", 8568, "Lenovo");
        lap2.setColor("black");
        lap2.setHDD(4567);
        lap2.setOS("Windows");
        lap2.setRAM(4);

        laptop lap3 = new laptop("DHJ66", 4643, "HP");
        lap3.setColor("black");
        lap3.setHDD(777);
        lap3.setOS("Windows");
        lap3.setRAM(10);

        laptop lap4 = new laptop("GKB91", 5551, "HP");
        lap4.setColor("black");
        lap4.setHDD(666);
        lap4.setOS("Windows");
        lap4.setRAM(12);

        laptop lap5 = new laptop("KH7645", 7356, "HP");
        lap5.setColor("white");
        lap5.setHDD(1000);
        lap5.setOS("Windows");
        lap5.setRAM(10);

        HashSet<laptop> laptops = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5));
        HashSet<laptop> res = new HashSet<>();

        System.out.println("Приветствую");
        System.out.print(
                "Введите цифру, соответствующего критерия:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print(
                    "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getRAM() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getOS().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getColor().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            laptop lap = (laptop) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }

    }
}
