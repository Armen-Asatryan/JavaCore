package homework.homework4;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2, 14, 6, 22};
        int value = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}


