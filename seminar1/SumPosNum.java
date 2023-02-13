package hw.seminar1;

// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
// Пример: 1 2 1 2 -1 1 3 1 3 -1 0
// 2 -1 переход - 2 в сумму
// 3 -1 переход 3 в сумму
// суммарно выведет 5

import java.util.Scanner;

public class SumPosNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения цифр (ввод 0 прекратит этот цикл): ");
        int sum = 0;
        int num = scanner.nextInt();
        while (num != 0) {
            int lastNum = num;
            num = scanner.nextInt();
            if (num != 0){
                if(lastNum > 0 && num < 0){
                    sum+=lastNum;
                }
            }
        }
        System.out.printf("Сумма равна %d",sum);
        scanner.close();
        }
    }
