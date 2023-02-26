package hw.seminar5.countingOccurrencesEachWord;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 */

public class Main {
    public static void main(String[] args) {
        String newStr = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] newStrMas = newStr.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "").split(" ");
        Map<String, Integer> mapStr = new HashMap<>();
        for (int i = 0; i < newStrMas.length; i++) {
            if (newStrMas[i] != "") {
                mapStr.putIfAbsent(newStrMas[i].toLowerCase(), 0);
                mapStr.put(newStrMas[i].toLowerCase(), mapStr.get(newStrMas[i].toLowerCase())+1);
            }
        }
        for (var entry:mapStr.entrySet()) {
            System.out.println(entry.getKey() +" встретилось: " + entry.getValue()+ " раз(а)");
        }
    }
}
