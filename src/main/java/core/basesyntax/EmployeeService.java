package core.basesyntax;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private EmployeeComparator employeeComparator = new EmployeeComparator();

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> sortedEmployee = new TreeSet<>(employeeComparator);
        sortedEmployee.addAll(employees);
        return sortedEmployee;
    }
}
