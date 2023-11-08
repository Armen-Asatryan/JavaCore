package homework.onlineshop;

public interface Command {
    String EXIT = "0";
    String SEARCH_DOCTOR_BY_PROFESSION = "1";
    String DELETE_DOCTOR_BY_ID = "2";
    String CHANGE_DOCTOR_BY_ID = "3";
    String ADD_PATIENT = "4";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "5";
    String PRINT_TODAY_PATIENTS = "6";


    String LOGIN ="1";
    String REGISTER ="2";

    public static void printAllCommands() {
        System.out.println("Please input " + EXIT  + "for EXIT ");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFFESION");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for DELETE DOCTOR BY ID");
        System.out.println("Please input " + CHANGE_DOCTOR_BY_ID + " for CHANGE DOCTOR BY ID");
        System.out.println("Please input " + ADD_PATIENT + " for ADD PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("Please input " + PRINT_TODAY_PATIENTS + " for PRINT ALL PATIENTS");
    }

    static void printLoginCommands() {
        System.out.println("Please input " + EXIT  + "for EXIT ");
        System.out.println("Please input " + LOGIN  + "for LOGIN ");
        System.out.println("Please input " + REGISTER + " for REGISTER");
    }
}

