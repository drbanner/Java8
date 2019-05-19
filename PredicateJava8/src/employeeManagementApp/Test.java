package employeeManagementApp;

import java.util.ArrayList;

class Employee
{
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
     String s = String.format("(%s,%s,%f,%s)",name,designation,salary,city);
        return s;
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("jane", "ceo",1212,"baltimore");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        populateEmployees(employees);
        System.out.println(employees);
    }

    private static void populateEmployees(ArrayList<Employee> employees) {
        employees.add(new Employee("jim","manager",25000,"baltimore"));
        employees.add(new Employee("john","sales guy",5000,"baltimore"));

        employees.add(new Employee("sub","accontent",2500,"owings mills"));

        employees.add(new Employee("mini","manager",25000,"Nj"));

    }
}
