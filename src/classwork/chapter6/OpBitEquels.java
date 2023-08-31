package classwork.chapter6;

public class OpBitEquels {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;

        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
