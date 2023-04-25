package Except.HW2;

// Если необходимо, исправьте данный код


public class Task2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

// Код выглядит корректным,но можно добавить обработку
// других возможных исключений,например,ArrayIndexOutOfBoundsException,
// если индекс выходит за пределы массива.
// Также можно добавить блок finally,
// чтобы гарантировать выполнение какого-то кода после блока try-catch,
// например, закрытие ресурсов.