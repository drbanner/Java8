package employeeManagementApp;

import java.util.ArrayList;
import java.util.function.Predicate;

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
        ArrayList<Employee> employees = new ArrayList<>();
        populateEmployees(employees);

        System.out.println("****************************************************************");

        Predicate<Employee> p1 = employee -> employee.designation.equalsIgnoreCase("manager");
        System.out.println("List of managers");
        display(p1,employees);
        System.out.println("****************************************************************");
        Predicate<Employee> p2 = employee -> employee.salary<25000;

        System.out.println("Employees with salary less that 25000: ");
        display(p2,employees);
        System.out.println("****************************************************************");
        Predicate<Employee> p3 = employee -> employee.city.equalsIgnoreCase("texas");

        System.out.println("Employees living in baltimore: ");

        display(p3,employees);
        System.out.println("****************************************************************");


        System.out.println("Fire managers from texas: ");

        display(p3.and(p1),employees);

        System.out.println("****************************************************************");

        System.out.println("Employees who are managers or whose salary is less that 25000 ");

        display(p2.or(p1),employees);

        System.out.println("****************************************************************");

        System.out.println("Employees who are not managers:");

        display(p1.negate(),employees);

        System.out.println("****************************************************************");

    }

    private static void display(Predicate<Employee> p1, ArrayList<Employee> employees) {

        for (Employee emp: employees)
        {
            if(p1.test(emp))
            {
                System.out.println(emp);
            }
        }
    }

    private static void populateEmployees(ArrayList<Employee> employees) {

        employees.add(new Employee("Sheldon","manager",25000,"baltimore"));
        employees.add(new Employee("Amy","sales guy",5000,"baltimore"));
        employees.add(new Employee("Lenard","CEO",250000,"mills"));
        employees.add(new Employee("Penny","manager",25000,"nebraska"));
        employees.add(new Employee("Raj","manager",25000,"bombay"));
        employees.add(new Employee("Short","manager",20000,"texas"));
        employees.add(new Employee("Howard","sales guy",5000,"texas"));
        employees.add(new Employee("Jane","manager",20000,"texas"));


    }
}
