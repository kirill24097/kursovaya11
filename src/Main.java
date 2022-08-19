import Kursovaya1.Employee;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee emp1 = new Employee("кирилл", "Смирнов", "Анатольевич", 1, 113333);
        Employee emp2 = new Employee("кирилл", "Смирнов", "Анатольевич", 1, 113333);

        System.out.println(emp1);
        System.out.println(emp2);

        employees[0] = emp1;
        employees[1] = emp2;
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }


    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
}











