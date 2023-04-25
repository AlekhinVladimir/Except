package Except.HW2;

// Реализуйте метод,который запрашивает у пользователя ввод дробного числа(типа float),
// и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number;
        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное значение. Попробуйте еще раз.");
            }
        }
        return number;
    }

}
