package Homework;

import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int n1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int n2 = scanner.nextInt();
        System.out.println("Выберите операцию (+, -, *, /): ");
        String op = scanner.nextLine();
        op = scanner.nextLine();
        int res;
        switch(op){
            case "+":            
            res = n1 + n2;
            System.out.print("Результат: " + res);
            break;
            case "-":
            res = n1 - n2;
            System.out.print("Результат: " + res);
            break;
            case "*":
            res = n1 * n2;
            System.out.print("Результат: " + res);
            break;
            case "/":
            double doubleRes = n1 / n2;
            System.out.print("Результат: " + doubleRes);
            break;
            default:
            System.out.print("Неверная операция!");
            break;

        }
    }
}
