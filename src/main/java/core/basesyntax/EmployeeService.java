package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> sortedEmployees = new TreeSet<>(
                Comparator.comparingInt(Employee::getAge)
                        .thenComparing(Employee::getName)
        );
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}