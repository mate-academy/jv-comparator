package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = employeeComparator();
        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }

    public static Comparator<Employee> employeeComparator() {
        return (o1, o2) -> {
            int result = Integer.compare(o1.getAge(), o2.getAge());
            if (result == 0) {
                result = o1.getName().compareTo(o2.getName());
            }
            return result;
        };
    }
}
