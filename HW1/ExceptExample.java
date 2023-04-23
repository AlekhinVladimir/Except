package Except.HW1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//  каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//  Если длины массивов не равны, необходимо как-то оповестить пользователя.
// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//  каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//  Если длины массивов не равны, необходимо как-то оповестить пользователя.
//  Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.io.IOException;
import java.util.Arrays;

public class ExceptExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            method2();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5};
            int[] result = subtractArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {0, 1, 2};
            int[] result = divideArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void method1() throws Exception {                // method1() генерирует Exception
        throw new Exception("This is an Exception");
    }

    public static void method2() throws IOException {             //method2() генерирует IOException
        throw new IOException("This is an IOException");
    }

    public static int[] subtractArrays(int[] arr1, int[] arr2) throws Exception {    //subtractArrays() генерирует Exception, если длины массивов не равны
        if (arr1.length != arr2.length) {
            throw new Exception("Arrays have different lengths");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {           //divideArrays() генерирует RuntimeException, если длины массивов не равны или если происходит деление на ноль
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays have different lengths");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Division by zero");
            }
            result[i] = arr1[i] / arr2[i];
        }

        return result;
    }
}
// Таким образом, в этом коде мы можем получить следующие типы исключений:

// - Exception
// - IOException
// - RuntimeException