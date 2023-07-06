package java_projects.lesson_6.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class task_2 {
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
