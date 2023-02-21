package hw.seminar3.searchHighestPrice;

import java.util.ArrayList;
import java.util.List;

import hw.seminar3.searchHighestPrice.model.Items;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */

public class Main {
    public static void main(String[] args) {
        Items item = new Items("Томат высший сорт", 20, "1 сорт");
        Items item2 = new Items("Помидор высший сорт", 23, "2 сорт");
        Items item3 = new Items("Томат", 24, "2 сорт");
        Items item4 = new Items("Кукуруза высший сорт", 25, "4 сорт");

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        System.out.println(itemsList);

        Integer maxPrice = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            Items product = itemsList.get(i);
            if (product.getSort().equals("1 сорт") || product.getSort().equals("2 сорт")) {
                if (product.getName().contains("высший")) {
                    if (product.getPrice() > maxPrice) {
                        maxPrice = product.getPrice();
                    }
                }
            }
        } 
        System.out.println("Наибольшая цена "+ maxPrice);
    }
}
