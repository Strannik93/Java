package hw.seminar3.getNamesGoodsGivenGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hw.seminar3.getNamesGoodsGivenGrade.model.Items;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class Main {
    public static void main(String[] args) {
        Items items = new Items("Помидор", "Страна1", 20, 25, "3 сорт");
        Items items1 = new Items("Тыква", "Страна1", 5, 15, "1 сорт");
        Items items2 = new Items("Помидор", "Страна2", 13, 15, "1 сорт");
        Items items3 = new Items("Зерно", "Страна3", 30, 18, "2 сорт");
        Items items4 = new Items("Зерно", "Страна2", 15, 18, "3 сорт");
        Items items5 = new Items("Помидор", "Страна1", 20, 15, "1 сорт");

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        System.out.println(itemsList);

        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Введите сорт: ");
        String findStr = scanner.nextLine();
        scanner.close();
        
        List<String> findList = new ArrayList<>();
        Integer minPrice = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            Items product = itemsList.get(i);
            if (product.getSort().equals(findStr)) {
                if (findList.size() == 0) {
                    minPrice = product.getPrice();
                    findList.add(product.getName());
                }
                else {
                    if (product.getPrice() < minPrice) {
                        minPrice = product.getPrice();
                        findList.clear();
                        findList.add(product.getName());
                    }
                    else {
                        if (product.getPrice() == minPrice) {
                            if (checkName(findList, product.getName())) {
                                findList.add(product.getName());
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Наименьшая цена "+minPrice);
        System.out.println("Наименования товаров: "+findList);
    }
    public static boolean checkName(List <String> findList, String find) {
        for (int i = 0; i < findList.size(); i++) {
            if (findList.get(i) == find) {
                return false;
            }
        }
        return true;
    }
}
