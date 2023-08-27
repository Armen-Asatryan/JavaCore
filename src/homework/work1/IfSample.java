package homework.work1;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 22;
        y = 44;
        if (x < y) {
            System.out.println("x is less than y " + "22 < 44");

            x = x * 2;
            if (x == y)
                System.out.println("x is equal than y " + "44 = 44");

            x = x * 2;
            if (x > y)
                System.out.println("x is greater than y " + "88 > 44");

            x = x - 66;
            if (x < y) {
                System.out.println("x is less than y " + "22 < 44");

            }
        }
    }
}
