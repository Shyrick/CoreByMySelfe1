package Lesson3.L3_HW;

import java.util.Scanner;

public class L3_hw_Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввдеите размер массива");
        int length = scanner.nextInt();
        int [] array = new int [length];

        System.out.println("Ввдеите массив");

        for (int i = 0; i < array.length ; i++) {
            array [i] = scanner.nextInt();
        }

        int min = array [0];
        for (int i = 1; i < array.length ; i++) {
            if (array [i] < min){
                min = array [i];
            }
        }
        System.out.println("Минимальное число в массиве - " + min);

        int max = array [0];
        for (int i = 1; i < array.length ; i++) {
            if (array [i] > max){
                max = array [i];
            }
        }
        System.out.println("Максимальное число в массиве - " + max);

        int count5 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] == 5){
                count5 ++;
            }

        }
        System.out.println("Количество повторений числа 5 = " + count5);
    }

}
