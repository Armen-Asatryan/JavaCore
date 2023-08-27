package classwork.chapter4;

public class NumbersArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 4, 0, 33, 67, 3, 1, 7, 8, 98, 55, 77, 11, 23};
        int lastindex = numbers.length - 1;
        System.out.println(numbers[lastindex]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " | ");

        }

        }

    }

