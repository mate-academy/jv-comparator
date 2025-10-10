package core.basesyntax;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        Set<Employee> employeesSet = new TreeSet<>(new EmployeeComparator());
        employeesSet.addAll(employees);
        return employeesSet;
    }
}
