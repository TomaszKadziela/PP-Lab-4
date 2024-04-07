import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Marek Kowalski", 3500, 0);
        employees[1] = new Employee("Sylwia Kopacz", 7000, "Marketing");
        employees[2] = new Employee("Tomasz Kądziela", 4000);
        employees[3] = new Employee("Kamil Kajak", 4500, "Tester Jakości");
        employees[4] = new Employee("Albert Marcel", 6300, "HR");


        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(75000);


        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
