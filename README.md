package java_projects;

import java.util.Arrays;

/**
 * 5. Дана последовательность натуральных чисел a1, a2, ..., an.
 * Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */
public class pr3 {

    public static void main(String[] args) {
        int[] array = {1, 6, 2, 17, -6, 0};
        System.out.println(Arrays.toString(arrayOfEvens(array)));
        System.out.println(Arrays.toString(funcArrayOfEvens(array)));
    }

    public static int[] funcArrayOfEvens(int[] array) {
        int[] result = Arrays.stream(array).filter(n -> (n % 2) == 0).toArray();
        if (result.length == 0) {
            System.out.println("There is not even numbers");
        }
        return result;
    }

    public static int[] arrayOfEvens(int[] array) {

        // calculate length of result array
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCounter++;
            }
        }

        // create empty result array
        int[] result = new int[evenCounter];

        // fill result array with even numbers of the given array
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[j++] = array[i];
            }
        }

        if (result.length == 0) {
            System.out.println("new array");
        }

        return result;
    }

} 

// минимальное и максимальное

public class pr3 {
    public static void main(String[] args) {
        int[] intArray = {24, 2, 0, 347, 12, 1, 2};

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
        int[] intArray = {99, 7, 0, 34, 192, 10, 2};

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

deque
public class sample_5 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arc1 = new int[10];
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(i);
            arc1[i] = val;
        }
    }

    public static Deque<Integer> inArray(int[] array) {
        Deque<Integer> result = new LinkedList<>();
        for (int i : array) {
            result.add(i);
        }
        System.out.print(result);
        return result;
    }
}

страны и имена 
ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");
          
        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy
         
        System.out.printf("Queue size: %d \n", states.size());  // 5
         
        // перебор коллекции        
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }
          
         // очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for(Person p : people){
          
            System.out.println(p.getName());
        }
    }
}
class Person{
      
    private String name;
    public Person(String value){
          
        name=value;
    }
    String getName(){return name;}
}
