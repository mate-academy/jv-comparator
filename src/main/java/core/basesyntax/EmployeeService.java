package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int compareAge = Integer.compare(o1.getAge(), o2.getAge());
                if (compareAge != 0) {
                    return compareAge;
                }
                return o1.getName().compareTo(o2.getName());
            }
        };
        Set<Employee> result = new TreeSet<>(employeeComparator);
        result.addAll(employees);
        return result;
    }
}
