package Lesson3.L3_Practice;

import java.util.Scanner;

public class L3_pr_Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа А и В");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Вы ввели А = "+ a + " и В = " + b);


        int temp = a;
        a = b;
        b = temp;

        System.out.println("Плсе замены А = "+ a + " и В = " + b);
    }

}
