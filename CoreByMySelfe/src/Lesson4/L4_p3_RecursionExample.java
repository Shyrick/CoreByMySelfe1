package Lesson4;

public class L4_p3_RecursionExample { STOP 1:03:00

    static String printNubers (int n){
        if (n <= 0 ) return "";

        return printNubers(n-1) + " " + n;
    }
    public static void main(String[] args) {
        String str = printNubers(3);
        System.out.println(str);
    }
}
