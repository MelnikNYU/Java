package OOP.Lesson_5.Seminar.homework.utils;

public class Validate {
    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new PhoneException("Ошибка");
        }
        else if(telephone.length() != 12) {
            throw new PhoneException("Неверное количество цифр");
        }
    }
}
