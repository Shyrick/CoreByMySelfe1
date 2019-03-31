package Lesson3;

import Lesson2.L2_Lection.L2_p1_VariableTypes;

import java.util.Scanner;

public class L3_p1_IfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи");
        int taskNumber = scanner.nextInt();

        if (taskNumber == 0){
            L2_p1_VariableTypes.main(args);// Если ввели не 0 - запускаем на выполнение класс из предыдущего урока

            // СТОП 10:00
        }
    }
}
