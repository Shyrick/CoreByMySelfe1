package Lesson4;

public class L4_p1_MethodExample {

    static void printHello (){
        System.out.println("Hello");
    }

// Метод для вывода любого массива в консоль в одну строку
    static void printArray (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i] + " ");
        }
        //Внутри метода можно вызывать другой метод
        printHello();
    }

    public static void main(String[] args) {

        int[] array = {1, 3, 7, 15, 6, 100};
        int[] array2 = {1, 43, 72, 1, 64, 105};
        printArray( array);

        // Код для вывода маасива array в консоль в одну строку
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + " ");
        }

        // Код для вывода маасива array2 в консоль в одну строку
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2 [i] + " ");
        }
    }
}
