package classwork.chapter6;

public class Ternary {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = a < 0 ? -a : a;

        System.out.println();
        System.out.println(a + " = " + b);

        a = -10;
        b = a < 0 ? -a : a;
        System.out.println(a + " " + b);
    }
}
