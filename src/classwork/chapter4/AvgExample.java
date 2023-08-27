package classwork.chapter4;

public class AvgExample {
    public static void main(String[] args) {
        int[] numbers = {9, 9, 8, 8, 9, 2, 2, 9,};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println(sum);
        System.out.println(sum / numbers.length);
    }

}

