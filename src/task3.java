/*
Задание 3
Необходимо написать алгоритм, выполняющий сортировку массива целых чисел по
убыванию. Массив вводится вручную во время выполнения программы.

Используется сортировка пузырьком.
 */
import java.util.Scanner;
public class task3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        input.close();

        bubbleSort(array);
        System.out.print ("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
    }
    public static void bubbleSort(int[] array){
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    tmp = array[i];
                    array[i] = array[k];
                    array[k] = tmp;
                }
            }
        }
}
}
