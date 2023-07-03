package java_projects.lesson_5;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)  n:c, o:o, t:d, e:e

// Пример 1:

// Input: s = "foo", t = "bar", f:b, o:a, --- false

// Output: false

// Пример 2:

// Input: s = "paper", t = "title" p:t, a:i, e:l, r:e,

// Output: true

public class sample_2 {
    public static void main(String[] args) {
        String etalon = new String("paperu");
        String check = new String("eeeeee");
        System.out.println(checker(etalon, check));
    }

    public static boolean checker(String etalon, String check) {
        if (etalon.length() != check.length()) {
            return false;
        }
        Map<Character, Character> comparesmentMap = new HashMap<>();
        for (int i = 0; i < etalon.length(); i++) {
            if (!comparesmentMap.containsKey(etalon.charAt(i))) {
                if (comparesmentMap.containsValue(check.charAt(i))) {
                    return false;
                }
                comparesmentMap.put(etalon.charAt(i), check.charAt(i));
            } else {
                if (comparesmentMap.get(etalon.charAt(i)) != check.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

}
