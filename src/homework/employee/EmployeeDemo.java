package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYE ID ");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
            String command = scanner.nextLine();
            switch (command){
                case"0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input Employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input Emoloyee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input EmployeeID");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("Please input Employee salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input Employee company");
                    String company = scanner.nextLine();
                    System.out.println("Please input Employee position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name,surname,emplyeeID,salary,company,position );
                    employeeStorage.add(employee);
                    System.out.println("Employee is registered!");
                    break;
                case "2":
                    System.out.println("_________________");
                    employeeStorage.print();
                    System.out.println("_________________");
                    break;
                case "3":
                    System.out.println("Please input ID");
                    String Id= scanner.nextLine();
                    employeeStorage.searchId(Id);
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String Cn= scanner.nextLine();
                    employeeStorage.searchCompanyname(Cn);
                    break;
                default:
                    System.out.println("invalid command.Try again!");
            }
        }
    }
}
