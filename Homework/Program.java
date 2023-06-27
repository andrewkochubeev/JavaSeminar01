package Homework;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер задачи (1 или 2):");
        int taskNumber = scanner.nextInt();
        switch (taskNumber) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            default:
                System.out.println("Неверный номер!");
                break;
        }

    }

    // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
    // чисел от 1 до n)
    public static void task1() {
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int result = n * (n + 1) / 2;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("Треугольное число - %d, Факториал - %d", result, fact);
    }

    // Вывести все простые числа от 1 до 1000
    public static void task2() {
        int count;
        for (int num = 0; num < 1000; num++) {
            count = 0;
           for (int i = 1; i < num / 2 + 1; i++) {
                if (num % i == 0) count++;
           }
           if (count == 1) System.out.print(num + " ");
        }
    }
}
