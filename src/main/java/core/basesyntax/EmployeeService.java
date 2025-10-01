package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        Set<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int compare = Integer.compare(o1.getAge(), o2.getAge());
                if (compare != 0) {
                    return compare;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        if (employees == null) {
            return set;
        }
        set.addAll(employees);
        return set;
    }
}
