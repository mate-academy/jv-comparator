package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {

        Comparator<Employee> comparator = Comparator
                .comparing(Employee::getAge)
                .thenComparing(Employee::getName);

        Set<Employee> sortedSet = new TreeSet<>(comparator);
        sortedSet.addAll(employees);
        return sortedSet;
    }
}
