package classwork.chapter8;

public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 2, 7, 9, 3, 4, 5};
        int val = 9;
        boolean found = false;
        for (int x : nums) {
            if (val == x) {
                found = true;
                break;

            }
        }
        if (found){
            System.out.println("Знaчeниe найдено!");
        }
    }
}
