import Kursovaya1.Employee;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee emp1 = new Employee("кирилл", "Смирнов", "Анатольевич", 1, 11111);
        Employee emp2 = new Employee("кирилл", "Смирнов", "Анатольевич", 2, 11112);
        Employee emp3 = new Employee("кирилл", "Смирнов", "Анатольевич", 3, 11113);
        Employee emp4 = new Employee("кирилл", "Смирнов", "Анатольевич", 4, 11114);


        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;


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


