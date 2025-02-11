package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", 18, "man","123456");
        Employee employee2 = new Employee("Anna", 17, "man","123456");
        Employee employee3 = new Employee("Barbara", 17, "man","123456");
        Employee employee4 = new Employee("Jack", 25, "man","123456");
        Employee employee5 = new Employee("A", 14, "man","123456");

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        EmployeeService employeeService = new EmployeeService();

        Set<Employee> setByOrder = employeeService.getEmployByOrder(list);

        System.out.println(setByOrder);

    }
}
