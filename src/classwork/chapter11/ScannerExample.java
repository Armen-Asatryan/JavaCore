package classwork.chapter11;

import homework.homework3.ArrayUtil;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers divided by ,");
        String numbersStr = scanner.nextLine();
        String[] numberStrArray = numbersStr.split(" ");
        int[] numbers = new int[numberStrArray.length];
        int index = 0;
        for (String numberStr : numberStrArray) {
            numbers[index++] = Integer.parseInt(numberStr);
        }
        int max = ArrayUtil1.max(numbers);
        System.out.println("Max:" + max);

//        System.out.println("Please input a");
//        int a = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please input b");
//        int b = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please input + or -");
//        String c = scanner.nextLine();
//        if (c.equals("+")) {
//            System.out.println(a + b);
//        }else if (c.equals("-")){
//            System.out.println(a-b);
//        }
//        else
//            System.out.println("unsuported");
////        System.out.println("Please input full name");
//        String FullName = scanner.nextLine();
//        String[] FullNameArray = FullName.split(" ");
//        System.out.println(FullNameArray[0]);
//        System.out.println(FullNameArray[1]);


    }
}
