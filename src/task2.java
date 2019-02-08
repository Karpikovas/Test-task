/*
Задание 2
Необходимо написать рекурсивный алгоритм, который находит числа Фибоначчи в
пределах от 1 до N. N вводится вручную во время выполнения программы.
 */
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int cnt = in.nextInt();
        in.close();

        int[] f = new int[cnt];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < cnt; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(f[i]);
            System.out.print(", ");
        }

    }
}
