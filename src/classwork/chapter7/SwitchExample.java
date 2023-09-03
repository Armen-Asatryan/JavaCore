package classwork.chapter7;

public class SwitchExample {
    public static void main(String[] args) {
        String lang = "ru";
        switch (lang) {
            case "hy":
            case "hay":
            case "arm":
            case "Arm":
            case "ARM":

                System.out.println("Բարեւ");
                break;

            case "RU":
            case "Ru":
            case "ru":
                System.out.println("Привет");
                break;

            case "ENG":
            case "Eng":
            case "English":

                System.out.println("Hello");

        }
    }
}
