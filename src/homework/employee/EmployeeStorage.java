package homework.employee;




public class EmployeeStorage {
    private Employee[] Employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == Employees.length) {
            extend();

        }
        Employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(Employees[i].getName() + " " + Employees[i].getSurname() + " " + Employees[i].getEmplyeeID() + " " + Employees[i].getSalary() + " " + Employees[i].getCompany() + " " + Employees[i].getPosition());

        }

    }

    public void searchId(String Id) {

        for (int i = 0; i < size; i++) {
            if (Employees[i].getEmplyeeID().contains(Id)) {
                System.out.println(Employees[i].getName() + " " + Employees[i].getSurname() + " " + Employees[i].getEmplyeeID() + " " + Employees[i].getSalary() + " " + Employees[i].getCompany() + " " + Employees[i].getPosition());
            }
        }

    }
    public void searchCompanyname(String Cn ) {

        for (int i = 0; i < size; i++) {
            if (Employees[i].getName().contains(Cn)) {
                System.out.println(Employees[i].getName() + " " + Employees[i].getSurname() + " "  + Employees[i].getCompany());
            }
        }

    }
    private void extend() {
        Employee[] tmp = new Employee[Employees.length+10];
        System.arraycopy(Employees, 0, tmp,0,Employees.length);
        Employees = tmp;
    }


}
