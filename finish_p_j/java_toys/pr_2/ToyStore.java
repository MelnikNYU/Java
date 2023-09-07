package finish_p_j.java_toys.pr_2;

import finish_p_j.java_toys.pr_2.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ToyStore {
    private static List<Toy> toys = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить новую игрушку");
            System.out.println("2. Провести розыгрыш");
            System.out.println("3. Выйти");

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
                    performLottery();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void addToy(String id, double weight) {
        Toy toy = new Toy(id, weight);
        toys.add(toy);
        System.out.println("Игрушка \"" + id + "\" с весом " + weight + " добавлена.");
    }

    private static void performLottery() {
        if (toys.isEmpty()) {
            System.out.println("В магазине нет игрушек для розыгрыша.");
            return;
        }

        double totalWeight = toys.stream().mapToDouble(Toy::getWeight).sum();
        double winningNumber = random.nextDouble() * totalWeight;

        double currentWeight = 0;
        Toy winner = null;
        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (winningNumber <= currentWeight) {
                winner = toy;
                break;
            }
        }

        if (winner != null) {
            System.out.println("Выиграла игрушка: " + winner.getId());
        } else {
            System.out.println("Никто не выиграл. Попробуйте снова.");
        }
    }
}
   