package finish_p_j.java_toys.pr_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import finish_p_j.java_toys.pr_1.Doll;
import finish_p_j.java_toys.pr_1.Robot;
import finish_p_j.java_toys.pr_1.Toys;
import finish_p_j.java_toys.pr_1.Winner;
import finish_p_j.java_toys.pr_1.Main;

public class lohotron {
    public static void main(String[] args) {
        int counter = 1;
        while (counter-- > 0) {
            Winner.append(String.format("Имя"),
                    nameRnd.getRandomString();
        }
        System.out.println(Winner.toString());
    }

    private static void performlohotron() {
        if (toys.isEmpty()) {
            System.out.println("Нет соответствующих игрушек.");
            return;
        }

        double totalWeight = toys.stream().mapToDouble(Toys::getWeight).sum();
        double winningNumber = random.nextDouble() * totalWeight;

        double currentWeight = 0;
        Toys winner = null;
        for (Toys toy : toys) {
            currentWeight += toys.getWeight();
            if (winningNumber <= currentWeight) {
                winner = toy;
                break;
            }
        }

        if (winner != null) {
            System.out.println("Выпала игрушка: " + winner.getId());
        } else {
            System.out.println("Ошибка. Попробуйте снова.");
        }
    }
}
