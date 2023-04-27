package Except.HW2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            // String name = null;
            // System.out.println(name.length());

            int a = 90;
            int b = 0;
            System.out.println(a / b);

            printSum(23, 234);

            // int[] abc = { 1, 2 };
            // abc[2] = 9;
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }catch (/by zero ex){
                System.out.println("Делить на 0 нельзя");
            
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

     }
     
     public static void printSum(int a, int b) throws FileNotFoundException {
        System.out.println(a + b);
     }
}
