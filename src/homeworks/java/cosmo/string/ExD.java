package homeworks.java.cosmo.string;

import java.lang.reflect.Array;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!”
 * и выводит каждый символ строки на отдельной строке.
 * <p>
 * Подсказка: используйте метод .toCharArray() класса String
 */
public class ExD {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
//        System.out.println(input.length());
        char[] chrArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(chrArray[i]);

        }
    }
}