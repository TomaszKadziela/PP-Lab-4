public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];


        employees[0] = new Employee("Marek Kowalski", 3500);
        employees[1] = new Employee("Sylwia Kopacz", 7000);
        employees[2] = new Employee("Tomasz Kądziela", 4000);
        employees[3] = new Employee("Kamil Kajak", 4500);
        employees[4] = new Employee("Albert Marcel", 6300);

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(70000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}