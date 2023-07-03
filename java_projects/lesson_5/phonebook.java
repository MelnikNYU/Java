package java_projects.lesson_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phonebook {
    private static HashMap<String, String> pb = new HashMap<String, String>();
    private static void addPB(String phone, String name) {
        pb.put(phone, name);
    }

    private static void savePB() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
        for(Map.Entry<String,String> k: pb.entrySet()){
            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        }
        writer.close();
    }

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

    public static void PrintPhonebook(){
        System.out.println("Контакты: ");
        for(Map.Entry<String,String> k: pb.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
    }

    public static String FindSurname(String number){
        String result = pb.get(number);
        if (result == null) return "Абонент не найдей";
        return result;
    }

    public static String[] FindNumberPhone(String surname){
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : pb.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("Абонент не найден");
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) throws IOException {
        String act;
        loadPB();
        PrintPhonebook();
        System.out.println("выбор действия: (add)добавить данные, (num) найти номера, (sur)найти фамилию, " +
                            "(save)сохранить, (exit)выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            if(act.equals("add")){
                System.out.println("Введите фамилию:");
                String name = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                addPB(phone, name);
            }else{
                    if (act.equals("num")){
                        System.out.println("Введите фамилию:");
                        String surname = bf.readLine();
                        String[] numbers = FindNumberPhone(surname);
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        if (act.equals("sur")) {
                            System.out.println("Введите номер:");
                            String number = bf.readLine();
                            System.out.println(FindSurname(number));
                        } else {
                            if(act.equals("save")){
                                savePB();
                            }
                        }
                    }
                }
            }
            System.out.println("выбор действия: (add)добавить данные, (num) найти номера по фамилии, (sur)найти фамилию, (save)сохранить, (exit)выход");
            act=bf.readLine();
        }
    }
    
// public class phonebook {
//    public static void main(String[] args) {
//         Map<Integer, String> phonebook = new HashMap<>();
//         phonebook.put(99999, "Иванов");
//         phonebook.put(777777, "Васильев");
//         phonebook.put(567777, "Петров");
//         phonebook.put(266632, "Иванов");
//         phonebook.put(6994321, "Петров");
//         phonebook.put(345678, "Иванов");
//         for (var item : phonebook.entrySet()) {
//             if (item.getValue().equals("Иванов")) {
//                 System.out.printf("%d: %s \n", item.getKey(), item.getValue());
//             }
//         }
//         for (Integer key : phonebook.keySet()) {
//             if (phonebook.get(key).equals("Иванов")) {
//                 System.out.printf("\n %d: %s \n", key, phonebook.get(key));
//             }
//         }
//     } 
// }
