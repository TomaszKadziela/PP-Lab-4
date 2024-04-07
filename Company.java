import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];


        employees[0] = new Manager("Marek Kowalski", 10000, 0);
        employees[1] = new Worker("Sylwia Kopacz", 7000, "Marketing");
        employees[2] = new Employee("Tomasz Kądziela", 4000);
        employees[3] = new Worker("Kamil Kajak", 4500, "Tester Jakości");
        employees[4] = new Worker("Albert Marcel", 6300, "HR");

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
