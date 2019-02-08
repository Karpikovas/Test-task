/*
Задание 4
Необходимо написать программу, считывающую четыре логических значения и
печатающую “True” в том случае, если ровно два из них истинны. Значения вводятся
вручную во время выполнения программы.
 */
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        String array[] = new String[4]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        for (int i = 0; i < 4; i++) {
            array[i] = input.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        input.close();

        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (array[i].equals("True")){
                flag ++;
            }
        }
        if (flag == 2)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
