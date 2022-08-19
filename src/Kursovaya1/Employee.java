package Kursovaya1;

    public class Employee {
        private static int counter;
        private final Integer id;
        private final String name;
        private final String lastName;
        private final String middleName;
        private int department;
        private int salary;


        public Employee(String name, String lastName, String middleName, int department, int salary) {
            this.name = name;
            this.lastName = lastName;
            this.middleName = middleName;
            this.department = department;
            this.salary = salary;
            this.id = counter++;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public int getDepartment() {
            return department;
        }

        public Integer getId() {
            return id;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void setDepartment(byte department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "Сотрудник  " + "ID =  " + "Имя=  " + name + " " + "фамилия=  " + lastName + "  " + "отчество=  " + middleName + "  " +
                    "Отдел=  " + department + "  " + "Зарплата  " + salary + "  ";
        }

    }