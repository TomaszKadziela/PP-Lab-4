import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Dodawanie pracowników
        employees[0] = new Manager("Sandra Wójcik", 50000, 0);
        employees[1] = new Worker("Przemysław Zaremski", 60000, "Deweloper");
        employees[2] = new Employee("Sylwia Poznańska", 55000);
        employees[3] = new Worker("Dajana Majda", 65000, "Księgowa");
        employees[4] = new Worker("Julita Reklińska", 70000, "Menedżer marketingu");

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
