package java_projects;

import java.util.Arrays;

// без четных чисел
public class pr3 {

    public static void main(String[] args) {
        int[] array = {1, 6, 2, 17, -6, 0};
        System.out.println(Arrays.toString(arrayOfEvens(array)));
        System.out.println(Arrays.toString(funcArrayOfEvens(array)));
    }

    public static int[] funcArrayOfEvens(int[] array) {
        int[] result = Arrays.stream(array).filter(n -> (n / 2) == 0).toArray();
        if (result.length == 0) {
            System.out.println(" ");
        }
        return result;
    }

    public static int[] arrayOfEvens(int[] array) {

        
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] / 2 == 0) {
                evenCounter++;
            }
        }

        
        int[] result = new int[evenCounter];

        
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] / 2 == 0) {
                result[j++] = array[i];
            }
        }

        if (result.length == 0) {
            System.out.println(" ");
        }

        return result;
    }

} 

// минимальное и максимальное

public class pr3 {
    public static void main(String[] args) {
        int[] intArray = {1, 6, 2, 17, 0};

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);
    }
}

public class pr3 {
    public static void main(String[] args) {
        int[] intArray = {1, 6, 2, 17, 0};

        int minNum = intArray[0];

        for (int j : intArray) {
            if (j > minNum)
                minNum = j;
        }

        System.out.println("Minimum number = " + minNum);
    }
}

// среднее арифм
 
public class pr3 {
    public static double average(int[] numbers) {
        var length = numbers.length;
        var sum = 0;

        for (double num : numbers) {
            sum += num;
        }
        return sum / length;
    }
}