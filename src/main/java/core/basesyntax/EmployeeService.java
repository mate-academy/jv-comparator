package core.basesyntax;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {

        Set<Employee> sortedSet = new TreeSet<>(new EmployeeComparator());
        sortedSet.addAll(employees);
        return sortedSet;
    }
}
