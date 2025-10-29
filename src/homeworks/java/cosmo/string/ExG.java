package homeworks.java.cosmo.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String[] words = input.split(" ");
        StringBuilder strBuild = new StringBuilder();

        for (int i = words.length-1; i >= 0; i--) {
            strBuild.append(words[i]).append(" ");
        }
        
        String result = strBuild.toString()
                .trim()
                .replace("?", " ")
                .toLowerCase()
                .replaceFirst("д", "Д")
                + "?";

        System.out.println(result);
    }
}