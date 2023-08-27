package homework.work1;

public class Day {
    public static void main(String[] args) {
        int minutes;
        int hours;
        int day;
        long seconds;
        minutes = 60;
        hours = minutes * 60;
        day = hours * 24;
        seconds = day;
        System.out.println("one days = " + seconds + " seconds");
        int days = day * 11;
        seconds = days;
        System.out.println("11 days = " + seconds + " seconds");
        long mounths = day * 31;
        seconds = mounths;
        System.out.println("1 mouth = " + seconds + " seconds");

    }
}
