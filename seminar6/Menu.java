package hw.seminar6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import hw.seminar6.model.Notebook;

public class Menu {
    public static void mainMenu(List<Notebook> totalList, Map<String,String> filterList) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in, "cp866");
        List<Notebook> copyList =  new ArrayList<Notebook>(totalList);
        while (check) {
            System.out.println("Параметры поиска:\n" + filterList);
            System.out.println("Для изменения параметров поиска введите:");
            System.out.println("0 - название, 1 - ОЗУ, 2 - объем жесткого диска");
            System.out.println("3 - операционная система, 4 - цвет, 5 - цена");
            System.out.println("Очистить поля - clear, Выход - exit");
            String request = scanner.next();
            switch (request) {
                case "0":
                case "3":
                case "4":
                    System.out.println("Введите новое значение");
                    String newValue = scanner.next();
                    String tempStr = filterList.get(Notebook.fieldReturn(request));
                    filterList.put(Notebook.fieldReturn(request), newValue);
                    if (tempStr != null) copyList = new ArrayList<Notebook>(totalList);
                    Notebook.printList(copyList, filterList);
                    break;
                case "1":
                case "2":
                case "5":
                    System.out.println("Введите новое значение");
                    String newIntValue = scanner.next();
                    if (Notebook.isNumber(newIntValue)) {
                        String tempInt = filterList.get(Notebook.fieldReturn(request));
                        filterList.put(Notebook.fieldReturn(request), newIntValue);
                        if (tempInt != null) copyList = new ArrayList<Notebook>(totalList);
                        Notebook.printList(copyList, filterList);
                    } else System.out.println("Данный параметр может быть только числом\n");
                    break;
                case "clear":
                    filterList = Notebook.createFilter();
                    copyList = new ArrayList<Notebook>(totalList);
                    break;
                case "exit":
                    check = false;
                    break;
            } 
        }
        scanner.close();
    }
}
