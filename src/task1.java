/*
Задание 1
Необходимо написать программу, которая вычисляет простые числа в пределах от 1
до N. N вводится вручную во время выполнения программы.
 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.print(1);
        System.out.print(", ");

        int n = 1;
        while (n <= num){
            for (int i = 2; i <= n; i++){
                if ((n % i) == 0 && !(i == n)){
                    break;
                }
                if (i == n){
                    System.out.print(n);
                    System.out.print(", ");
                }
            }
            n++;
        }

    }
}
