package finish_p_j.java_toys.pr_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import finish_p_j.java_toys.pr_1.Doll;
import finish_p_j.java_toys.pr_1.Robot;

public class Main {
    private static List<Toys> toys = new ArrayList<>();
    private static Random random = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить новую игрушку");
            System.out.println("2. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистить

            switch (choice) {
                case 1:
                    System.out.println("Введите название игрушки:");
                    String id = scanner.nextLine();
                    System.out.println("Введите вес игрушки:");
                    double weight = scanner.nextDouble();
                    addToy(id, weight);
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Ошибка.");
            }
        }
    }

    private static void addToy(String id, double weight) {
        Toys toy = new Toys(id, weight);
        toys.add(toy);
        System.out.println("Игрушка \"" + id + "\" с весом " + weight + " добавлена.");
    }

    // Doll 3 = new Doll(id:"3", species:"Doll", weight:"200", action:"false");
    // 3.toAction();
    // System.out.println();

    // Robot 2 = new Robot(id:"2", species:"Robot", weight:"300", action:"true");
    // 2.toAction();
    // System.out.println();
    
}

