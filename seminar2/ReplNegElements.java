package hw.seminar2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

public class ReplNegElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int summ = 0;
        int n = scanner.nextInt();
        int[] massiv = new int[n];
        System.out.println("Заполнение массива");
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 0) {
                massiv[i] = summ;
            }
            else {
                if (massiv[i] > 9 && massiv[i] < 100) {
                    summ += i;
                }
            }
        }
        System.out.println(Arrays.toString(massiv));
    }
}
