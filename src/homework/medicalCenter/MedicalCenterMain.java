package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterMain {
    public static class Person implements Command {
        private static Scanner scanner = new Scanner(System.in);
        private static PersonStorage personStorage = new PersonStorage();

        public static void main(String[] args) {
            boolean isRun = true;
            while (isRun) {
                Command.printAllCommands();
                String command = scanner.nextLine();
                switch (command) {
                    case EXIT:
                        isRun = false;
                        break;
                    case ADD_DOCTOR:
                        addDoctor();
                        break;
                    case SEARCH_DOCTOR_BY_PROFESSION:
                        searchDoctorByProfession();
                        break;
                    case DELETE_DOCTOR_BY_ID:
                        deleteDoctorById();
                        break;
                    case CHANGE_DOCTOR_BY_ID:
                        changeDoctor();
                        break;
                    case ADD_PATIENT:
                        addPatient();
                        break;
                    case PRINT_ALL_PATIENTS_BY_DOCTOR:
                        printPatientsByDoctor();
                        break;
                    case PRINT_TODAY_PATIENTS:
                        personStorage.printTodaysPatients();
                        break;
                    default:
                        System.out.println("Invalid command.Try again!");

                }
            }

        }



        private static void printPatientsByDoctor() {
            personStorage.printDoctors();
            System.out.println("Please choose doctor ID");
            String doctorId = scanner.nextLine();
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById != null) {
                personStorage.printAllPatientsByDoctor(doctorById);
            } else {
                System.out.println("Doctor with" + doctorId + "Does not exists!");

            }
        }

        private static void addPatient() {
            personStorage.printDoctors();
            System.out.println("Please choose doctor ID");
            String doctorId = scanner.nextLine();
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById != null) {
                System.out.println("Please input id,name,surname,phone,registerDateTime,Ex(26-03-2022 12:00)");
                String patientDateStr = scanner.nextLine();
                String[] patientDate = patientDateStr.split(",");
                try {
                    Date registerDateTime = DateUtil.stringToDateTime(patientDate[4]);
                    if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                        Patient patient = new Patient();
                        patient.setId(patientDate[0]);
                        patient.setName(patientDate[1]);
                        patient.setSurname(patientDate[2]);
                        patient.setPhoneNumber(patientDate[3]);
                        patient.setDoctor(doctorById);
                        patient.setRegisterDateTime(registerDateTime);
                        personStorage.add(patient);
                        System.out.println("Patient registered!");
                    } else {
                        System.out.println("Doctor is unavailable in that time,please choose another time");
                    }

                } catch (ParseException e) {
                    System.out.println("Incorrect date time format please try again");
                }

            } else {
                System.out.println("Doctor with" + doctorId + "Does not exists!");
            }
        }

        private static void changeDoctor() {
            personStorage.printDoctors();
            System.out.println("Please choose doctor ID");
            String doctorId = scanner.nextLine();
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById != null) {
                System.out.println("Please input name,surname,PhoneNumber,Email,Profession");
                String doctorDateStr = scanner.nextLine();
                String[] doctorDate = doctorDateStr.split(",");
                doctorById.setName(doctorDate[0]);
                doctorById.setSurname(doctorDate[1]);
                doctorById.setPhoneNumber(doctorDate[2]);
                doctorById.setEmail(doctorDate[3]);
                doctorById.setProfession(doctorDate[4]);
                System.out.println("Doctor changed!");

            } else {
                System.out.println("Doctor with" + doctorId + "does not exists!!");
            }
        }

        private static void deleteDoctorById() {
            personStorage.printDoctors();
            System.out.println("Please choose doctor ID");
            String doctorId = scanner.nextLine();
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById != null) {
                personStorage.deleteDoctorById(doctorId);
            } else {
                System.out.println("Doctor with" + doctorId + "does not exists!!");
            }
        }

        private static void searchDoctorByProfession() {
            System.out.println("Please input Profession");
            String profession = scanner.nextLine();
            personStorage.searchDoctorByProfession(profession);
        }

        private static void addDoctor() {
            System.out.println("Please input DOCTOR ID");
            String doctorDateStr = scanner.nextLine();
            String[] doctorDate = doctorDateStr.split(",");
            String doctorId = doctorDate[0];
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById == null) {
                Doctor doctor = new Doctor();
                doctor.setId(doctorId);
                doctor.setName(doctorDate[1]);
                doctor.setSurname(doctorDate[2]);
                doctor.setPhoneNumber(doctorDate[3]);
                doctor.setEmail(doctorDate[4]);
                doctor.setProfession(doctorDate[5]);
                personStorage.add(doctor);
                System.out.println("Doctor registered.");
            } else {
                System.out.println("Doctor with" + doctorId + " Already exists!!");
            }
        }
    }
}
