package Lesson3.Arrays;

public class L3_p6_ForEachExample {
    public static void main(String[] args) {

        String [] array = {"aaa", "bbb", "ccc", "ddd"};

        // простой фор
        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }
// Фор ич
        // 1 создаем переменную с типом как массив (тут String value)
        // 2 после двоетеочия указываем по какому массиву нужно пройти (тут array)
        // в ходе работы цикла каждый элемент мвссива поочереди записывается в переменную и для работы с элементом,
        // нужно обрщаться к переменной
        for (String value:array) {
            System.out.println(value);
        }
    }
    // Time 1:27:00
}
