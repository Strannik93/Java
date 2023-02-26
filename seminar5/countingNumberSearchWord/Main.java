package hw.seminar5.countingNumberSearchWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова
 * через map (наполнением значение, где искомое слово будет являться ключом)
 */

public class Main {
    public static void main(String[] args) {
        String newStr = "Россия идет вперед всей планеты. Планета — это не Россия.";
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Ввод искомого слова");
        String searchWord = scanner.next().toLowerCase();
        scanner.close();
        String[] newStrMas = newStr.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "").split(" ");
        Map<String, Integer> mapStr = new HashMap<>();
        for (int i = 0; i < newStrMas.length; i++) {
            if (newStrMas[i] != "" && checkMatch(newStrMas[i].toLowerCase(), searchWord)) {
                mapStr.putIfAbsent(newStrMas[i].toLowerCase(), 0);
                mapStr.put(newStrMas[i].toLowerCase(), mapStr.get(newStrMas[i].toLowerCase())+1);
            }
        }
        if (mapStr.size() > 0) {
            System.out.println(searchWord +" встретилось: " + mapStr.get(searchWord) + " раз(а)");
        } else System.out.println(searchWord + " встретилось 0 раз");
    }

    public static boolean checkMatch(String str1, String str2) {
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) return false;
            }
        } else return false;
        return true;        
    }
}
