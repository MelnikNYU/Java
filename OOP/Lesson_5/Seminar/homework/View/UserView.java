package OOP.Lesson_5.Seminar.homework.View;

import java.util.Scanner;

import OOP.Lesson_5.Seminar.homework.model.Fields;
import OOP.Lesson_5.Seminar.homework.utils.Commands;
import notebook.model.User;
import OOP.Lesson_5.Seminar.homework.controller.ControllerUser;
import OOP.Lesson_5.Seminar.homework.utils.Validate;

public class UserView {
    private final ControllerUser ControllerUser;
    private final Validate validate;

    public UserView(ControllerUser ControllerUser, Validate validate) {
        this.ControllerUser = ControllerUser;
        this.validate = validate;
    }

    public void run(){
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case LIST:
                        list();
                        break;
                    case HELP:
                        showHelp();
                        break;
                    case DELETE:
                        delete();
                        break;
                }
            }
            catch(Exception ex) {
                System.out.println("Ошибка " + ex.toString());
            }
        }
    }
    private void read() throws Exception {
        String id = prompt("ID: ");
        User user_ = ControllerUser.readUser(id);
        System.out.println(user_);
    }

    private void delete() throws Exception{
        String userid = prompt("ID: ");
        ControllerUser.deleteUser(userid);
    }

    private void update() throws Exception {
        String userid = prompt("ID: ");
        String field_name = prompt("SNS,NAME,TELEPHONE): ");
        String param = null;
        if (Fields.valueOf(field_name) == Fields.TELEPHONE) {
            param = catchTelephone(param);
            if(param == null) {
                return;
            }
        }
        else {
            param = prompt("Что хотите изменить");
        }
        User _user = ControllerUser.readUser(userid);
        ControllerUser.updateUser(_user, Fields.valueOf(field_name.toUpperCase()), param);
    }
    public String catchTelephone(String telephone) throws Exception {
        while(true) {
            try {
                telephone = prompt("Введите номер телефона: ");
                if(telephone.equals("0")) {
                    System.out.println("back");
                    return null;
                }
                validate.checkNumber(telephone);
                return telephone;
            } catch(PhoneException ex) {
                System.out.println("Oшибка " + ex.toString());
            }
        }
    }
    private void list() throws Exception {
        for (User user : ControllerUser.getUsers()) {
            System.out.println(user);
        }
    }
    private void create() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = null;
        phone = catchTelephone(phone);
        if(phone == null) {
            return;
        }

        ControllerUser.saveUser(new User(firstName, lastName, phone));
    }
    private void showHelp() {
        System.out.println("Kоманды:");
        for(Commands c : Commands.values()) {
            System.out.println(c);
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
