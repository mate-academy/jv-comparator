package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName);

        Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
