package classwork.chapter4;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[60];
        for (int i = 0; i < 60; i++) {
            numbers[i] = i + 1;

        }
        for (int i = 0; i < 60; i++) {
            System.out.print(numbers[i] + " ");
            
        }

    }
}
