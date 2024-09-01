package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        return employees.stream().sorted(Comparator.comparingInt(Employee::getAge)
                .thenComparing(Employee::getName))
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
