package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> workers = new TreeSet<>(employeeComparator);
        workers.addAll(employees);

        return workers;
    }

    private final Comparator<Employee> employeeComparator = (firstEmployee, secondEmployee) -> {
        int ageComparison = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        return firstEmployee.getName().compareTo(secondEmployee.getName());
    };
}
