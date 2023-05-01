package Except.HW3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения (в формате дд.мм.гггг) номер_телефона (без пробелов) пол (f - женский, m - мужской)");        String input = scanner.nextLine();
        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Ошибка: неверное количество данных");
            return;
        }
        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String birthDateStr = data[3];
        String phoneNumberStr = data[4];
        String genderStr = data[5];
        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат даты рождения");
            return;
        }
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона");
            return;
        }
        if (!genderStr.equals("f") && !genderStr.equals("m")) {
            System.out.println("Ошибка: неверный формат пола");
            return;
        }
        String gender = genderStr.equals("f") ? "Ж" : "М";
        String output = lastName + firstName + middleName + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " " + phoneNumber + gender;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(lastName + ".txt", true))) {
            writer.write(output);
            writer.newLine();
            System.out.println("Данные успешно записаны в файл " + lastName + ".txt");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
            e.printStackTrace();
        }
    }
}
