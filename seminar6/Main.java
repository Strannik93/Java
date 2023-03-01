package hw.seminar6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import hw.seminar6.model.Notebook;

/**
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет 
 * ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ  2 - Объем ЖД    3 - Операционная система    4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации 
 * можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

public class Main {
    public static void main(String[] args) {
        List<Notebook> newList = new ArrayList<>();
        newList.add(new Notebook("ASUS Vivobook Pro 16 OLED", 16, 1024, "Windows 10 Home", "black", 120000));
        newList.add(new Notebook("Apple MacBook Air 13", 8, 256, "macOS", "white", 100000));
        newList.add(new Notebook("Xiaomi RedmiBook 14 II", 16, 512, "Windows 10 Home", "white", 56000));
        newList.add(new Notebook("HP Spectre X360", 16, 512, "Windows 10 Home", "black", 140000));
        newList.add(new Notebook("Lenovo ThinkPad X1 Carbon Gen 9", 16, 512, "Windows 10 Pro", "black", 200000));
        newList.add(new Notebook("Acer Aspire 3 A317-52-599Q", 8, 256, "Linux", "black", 75000));
        Map<String, String> filterMap = Notebook.createFilter();
        Menu.mainMenu(newList, filterMap);
    }
}
