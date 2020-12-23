package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee first, Employee second) {
                int compareAges = Integer.compare(first.getAge(), second.getAge());
                if (compareAges != 0) {
                    return compareAges;
                }
                return first.getName().compareTo(second.getName());
            }
        };
        Set<Employee> allEmployees = new TreeSet<>(comparator);
        allEmployees.addAll(employees);
        return allEmployees;
    }
}
