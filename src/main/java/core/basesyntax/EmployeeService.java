package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private final Comparator<Employee> employeeComparator = (firstEmployee, secondEmployee) -> {
        int ageComparison = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        return firstEmployee.getName().compareTo(secondEmployee.getName());
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> orderedEmployees = new TreeSet<>(employeeComparator);
        orderedEmployees.addAll(employees);

        return orderedEmployees;
    }
}
