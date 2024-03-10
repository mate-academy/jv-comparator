package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private static final Comparator<Employee> EMPLOYEE_COMPARATOR = new EmployeeByAgeAndNameComparator();
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        TreeSet<Employee> sortedEmployees = new TreeSet<>(EMPLOYEE_COMPARATOR);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
