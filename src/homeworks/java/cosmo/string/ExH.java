package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        String[] splited = fullName.split(" ");

        StringBuilder strBuild = new StringBuilder();

        for (String value : splited) {
            strBuild.append(value.charAt(0)).append(".");
        }
        String result = strBuild.toString();
        System.out.println(result);
    }
}
