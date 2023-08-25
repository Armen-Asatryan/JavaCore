package classwork.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;

        if (x < y) {
            System.out.println("x is less then y");

            x = x * 2;
            if (x == y)
                System.out.println("x is equal then y ");

            x = x * 2;
            if (x > y)
                System.out.println("x is greater than y");

            x = x - 20;
            if (x == y)
                System.out.println("x is equal then y ");

            x = x - 20;
            if (x == y)
                System.out.println("x is equal then y ");


        }
    }
}
