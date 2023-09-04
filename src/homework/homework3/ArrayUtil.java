package homework.homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        System.out.println("Work 1");
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};
        numbers[0] = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Work 2");
        System.out.println(numbers[0]);

        System.out.println("Work 3");
        int lastindex = numbers.length - 1;
        System.out.println(lastindex);
        System.out.println("Work 4");

        int array = numbers.length;
        System.out.println(array);

        System.out.println("Work 5");

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println("Work 7");
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(i);
                a = a + i;
            }
        }
        System.out.println(a);
        System.out.println("Work 9");
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            b = b + numbers[i];


        }
        System.out.println(b);
        System.out.println("Work 10");
        int d = 0;
        for (int i = 0; i < numbers.length; i++) {
            d = d + numbers[i];
        }
        System.out.println(d / numbers.length);


    }
}
