package hw.seminar2;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */

public class IncrSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        System.out.println("Общее количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("Ввод целых чисел");
        int num = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int lastNum = scanner.nextInt();
            if (lastNum <= num){
                check = false;
            }
            num = lastNum;
        }
        scanner.close();
        if (check){
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }
    }
}
