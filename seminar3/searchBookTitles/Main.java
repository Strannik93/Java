package hw.seminar3.searchBookTitles;

import java.util.ArrayList;
import java.util.List;

import hw.seminar3.searchBookTitles.model.Books;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */

public class Main {
    public static void main(String[] args) {
        Books books = new Books("first", "Устинов", 20, 2012, 70);
        Books books1 = new Books("second", "УстиновА", 25, 2015, 101);
        Books books2 = new Books("third", "Петров", 14, 2009, 89);
        Books books3 = new Books("fourth", "Иванов", 37, 2012, 51);
        Books books4 = new Books("fifth", "Иванов", 45, 2010, 71);
        Books books5 = new Books("sixth", "Петрова", 9, 2008, 17);

        List<Books> booksList = new ArrayList<>();
        booksList.add(books);
        booksList.add(books1);
        booksList.add(books2);
        booksList.add(books3);
        booksList.add(books4);
        booksList.add(books5);
        System.out.println(booksList);

        List<String> findList = new ArrayList<>();
        for (int i = 0; i < booksList.size(); i++) {
            Books current = booksList.get(i);
            if (current.getYear() >= 2010 && current.getSurname().toLowerCase().contains("а")) {
                if (checkSimplNum(current.getNumber())) {
                    findList.add(current.getName());
                }
            }
        }

        System.out.println("Наименования книг: "+ findList);
    }

    public static boolean checkSimplNum(int num) {
        if (num > 1){
            for (int i = 2; i < num; i++) {
                if (num%i == 0) {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
