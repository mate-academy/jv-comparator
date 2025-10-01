package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        Set<Employee> result = new TreeSet<>(
                Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getName)
        );

        for (Employee employee : employees) {
            result.add(employee);
        }

        return result;
    }
}
