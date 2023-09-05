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
        //Չի ստացվել:)
        System.out.println("Work 6");
       int num = numbers.length;
        for (int i = 0; i < num%2; i++) {
            int value = numbers[i];
            if (num>2){
                System.out.println();
            }
            if (num<=2){
                System.out.println("cant print middle values");
            }
            if (value%2==0){
                System.out.println();
            }
            if (value%2==1){

            }
        }
        System.out.println("Work 7");
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            if (value % 2==0) {
                sum = sum + value;
                count += 1;
            }
        }
        System.out.println(count);
        System.out.println(sum);

        System.out.println("Work 8");

        int resault = 0;
        int coun = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            if (value % 2!=0) {
                resault  = resault  + value;
                coun += 1;
            }
        }
        System.out.println(count);
        System.out.println(sum);

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
