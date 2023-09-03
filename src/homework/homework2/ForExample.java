package homework.homework2;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.print("-");
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i < 101; i++) {
            for (int j = 0; j < (i % 2); j++) {
                System.out.print(" " + i);

            }
        }
        System.out.println();
        System.out.println();

        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int max = array[0];
        int lastindex = array.length - 1;
        for (int i = 0; i <= lastindex; i++) {
            int currant = array[i];
            if (currant > max) {
                max = currant;
            }
        }

        System.out.println(max);

//        int a = 0;
//        for (int i = 0; i <= lastindex; i++) {
//            a = a + array[i];
//        }
//        System.out.print(a);
    }
}




