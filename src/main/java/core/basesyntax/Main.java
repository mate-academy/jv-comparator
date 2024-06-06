package core.basesyntax;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", 30, "Male", "123-456-7890"),
                new Employee("Alice", 25, "Female", "098-765-4321"),
                new Employee("Bob", 30, "Male", "111-222-3333"),
                new Employee("Diana", 25, "Female", "444-555-6666")
        );

        EmployeeService employeeService = new EmployeeService();
        Set<Employee> sortedEmployees = employeeService.getEmployByOrder(employees);

        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}
