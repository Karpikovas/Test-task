/*
Задание 5
Необходимо написать программу, которая проверяет слово на "палиндромность".
Слово для проверки вводится вручную во время выполнения программы.

 */
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter word: ");
        String word = input.nextLine();
        for (int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");// Читаем с клавиатуры
    }
}
