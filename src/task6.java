/*
Задание 6
Необходимо написать программу, которая удаляет из текста числа. Текст вводится
вручную во время выполнения программы.
 */
import java.util.Scanner;
public class task6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Enter word: ");
            String word = input.nextLine();
            System.out.println(word.replaceAll("[0-9]", ""));
    }
}
