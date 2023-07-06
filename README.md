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

package lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//На базе подходящего контейнерного класса разработать класс «Телефонный справочник», который бы содержал
// произвольное количество абонентов. Для каждого абонента известна фамилия и один номер телефона. Фамилии
// разных абонентов могут быть одинаковыми, номера телефонов - нет. Справочник должен иметь методы поиска
// номеров телефонов по фамилии и поиска фамилии по номеру телефона. Базовый контейнерный класс выбрать самостоятельно.

//     1. Добавить в класс «Телефонный справочник» методы сохранения справочника в файле и загрузки справочника из файла.
//     2. Добавить возможность пополнения справочника новыми абонентами с клавиатуры.


//Класс Phonebook реализует базу данный «Телефонный справочник»
//БД постоена на основе контейнера HashMap<String, String>
//в качестве ключа используется номер телефона в виде строку, а в качестве значения - фамилия
//класс включает в себя метод main который запускает работу с БД
//также включены методы
//addPB - добавляет запись по заданным номеру телефона и фамилии
//delPB - удаляет запись по номеру телефона
//savePB - сохраняет БД в текстовом файле phone.txt
//loadPB - загружает БД из текстового файла phone.txt
//PrintPhonebook - выводит на екран все записи БД
//FindSurname - производит поиск фамилии по номеру телефона
//FindNumberPhone - производит поиск списка номеров по фамилии

public class Phonebook {
    private static HashMap<String, String> pb = new HashMap<String, String>();

    //addPB - добавляет запись по заданным номеру телефона и фамилии
    private static void addPB(String phone, String name) {
        pb.put(phone, name);
    }

    //delPB - удаляет запись по номеру телефона
    private static void delPB(String phone) {
        pb.remove(phone);
    }

    //savePB - сохраняет БД в текстовом файле phone.txt
    private static void savePB() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
        for(Map.Entry<String,String> k: pb.entrySet()){
            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        }
        writer.close();
    }

    //loadPB - загружает БД из текстового файла phone.txt
    //производит проверку на наличие файла
    public static void loadPB() throws IOException {
        File file = new File("phone.txt");
        if (file.exists()){
            BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                String[] dat = act.split(" ");
                pb.put(dat[0], dat[1]);
            }
            reader.close();
        }
    }

    //PrintPhonebook - выводит на екран все записи БД
    public static void PrintPhonebook(){
        System.out.println("Телефонный справочник: ");
        for(Map.Entry<String,String> k: pb.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
    }

    //FindSurname - производит поиск фамилии по номеру телефона заданому в качестве аргумента
    //возвращает строку
    public static String FindSurname(String number){
        String result = pb.get(number);
        if (result == null) return "абонент с таким номером не найдей";
        return result;
    }

    //FindNumberPhone - производит поиск списка номеров по фамилии заданой в качестве аргумента
    //возвращает массив строк
    public static String[] FindNumberPhone(String surname){
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : pb.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с такой фамилией не найден");
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) throws IOException {
        //переменная описывает вызываемое действие
        String act;

        //загрузка БД
        loadPB();
        //вывод записей на екран
        PrintPhonebook();

        //вывод на екран описания возможных действий с указанием команд
        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти номера по фамилии, (sur)найти фамилию, " +
                            "(save)сохранить, (exit)выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            //добавление записи
            if(act.equals("add")){
                System.out.println("Введите фамилию:");
                String name = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                addPB(phone, name);
            }else{
                //удаление записи
                if(act.equals("del")){
                    System.out.println("Введите телефон:");
                    String phone = bf.readLine();
                    delPB(phone);
                }else{
                    //поиск номеров по фамилии
                    if (act.equals("num")){
                        System.out.println("Введите фамилию:");
                        String surname = bf.readLine();
                        String[] numbers = FindNumberPhone(surname);
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        //поиск фамилии по номеру
                        if (act.equals("sur")) {
                            System.out.println("Введите номер:");
                            String number = bf.readLine();
                            System.out.println(FindSurname(number));
                        } else {
                            //сохранение БД в файл
                            if(act.equals("save")){
                                savePB();
                            }
                        }
                    }
                }
            }
            //запрос на следующее действие
            System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти номера по фамилии, (sur)найти фамилию, (save)сохранить, (exit)выход");
            act=bf.readLine();
        }
    }
}


/*
 * 1 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2 Создать множество ноутбуков.
3 Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */

public class laptop {
    private String color;
    private Integer RAM;
    private String OS;
    private Integer HDD;
    private Integer id;
    private String brand;
    private String model;
    private boolean isBooked = false;

    public laptop(String model, Integer id, String brand) {
        this.model = model;
        this.brand = brand;
        this.id = id;
        System.out.println("Ноутбук марки " + "'" + this.brand + "'" + " Модель " + this.model + " С id "
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
            System.out.println("Ноут в резерве ");
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
            sb.append("Не резерв ");
        else
            sb.append("Резерв ");

        return (sb.toString());
    }

}

второй вариант
public class task_1 {
    public static void main(String[] args) {
        laptop lap1 = new laptop("A5", 1236, "Xiaomi");
        lap1.setColor("black");
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setRAM(8);

        laptop lap2 = new laptop("ABC30", 6467, "Acer");
        lap2.setColor("white");
        lap2.setHDD(1000);
        lap2.setOS("Windows");
        lap2.setRAM(8);

        laptop lap3 = new laptop("AB97", 67201, "Acer");
        lap3.setColor("rose");
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setRAM(16);

        laptop lap4 = new laptop("OMAN11", 1111, "hp");
        lap4.setColor("black");
        lap4.setHDD(700);
        lap4.setOS("Linux");
        lap4.setRAM(8);

        laptop lap5 = new laptop("MAC101", 8438483, "Apple");
        lap5.setColor("silver");
        lap5.setHDD(1000);
        lap5.setOS("macOS");
        lap5.setRAM(8);

        HashSet<laptop> laptops = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5));
        HashSet<laptop> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print(
                "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
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