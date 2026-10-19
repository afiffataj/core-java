class Employee {
    public static void main(String[] args) {
        System.out.println("Is the employee salary available");

        double salary = 25000.50;
        double salary1 = 35000.75;

        Employee.isTheEmployeeSalaryAvailable(salary, salary1);
    }

    static void isTheEmployeeSalaryAvailable(double a, double b) {
        System.out.println(a);
        System.out.println(b);
    }
}