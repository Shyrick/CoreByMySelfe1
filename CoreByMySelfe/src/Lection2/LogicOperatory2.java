package Lection2;

public class LogicOperatory2 {

    // Time 1:21:00
    public static void main(String[] args) {

        boolean t = true;
        boolean f = false;

        // Оператор && - "логическое И" (логичесчкое умножение)

        boolean resalt  = t && f;

        // 0 && 0 = 0
        // 1 && 0 = 0
        // 0 && 1 = 0
        // 1 && 1 = 1

        System.out.println("f && f = " + (f && f));
        System.out.println("t && f = " + (t && f));
        System.out.println("f && t = " + (f && t));
        System.out.println("t && t = " + (t && t));
        System.out.println();
        System.out.println();

        // Оператор || - "логическое ИЛИ" (логичесчкое сложение)

        boolean y = t || f;

        // 0 || 0 = 0
        // 1 || 0 = 1
        // 0 || 1 = 1
        // 1 || 1 = 1

        System.out.println("f || f = " + (f || f));
        System.out.println("t || f = " + (t || f));
        System.out.println("f || t = " + (f || t));
        System.out.println("t || t = " + (t || t));
        System.out.println();

        // Time 1:23:30

        // Проверим, является ли Х в диапазоне от 1000 до 2000

        int x = 20;
        resalt = x > 1000 && x < 2000;

        System.out.println("x = " + x  + " (1000 : 2000) = " + resalt);

        // Проверим, чтоб Х не входил в диапахон от 1000 до 2000

        System.out.println("x = " + x  + " !(1000 : 2000) = " + !resalt);
        // или
        resalt = x < 1000 || x > 2000;
        System.out.println("x = " + x  + " !(1000 : 2000) = " + resalt);

        // Time 1:30:00







    }

}
