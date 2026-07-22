package core.basesyntax;

import java.util.*;

public class EmployeeService implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getAge() == (employee2.getAge())) {
            return employee1.getName().compareTo(employee2.getName());
        }
        return Integer.compare(employee1.getAge(), employee2.getAge());
    }

    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        Set<Employee> sortedEmployees = new TreeSet<>(this);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }


}
