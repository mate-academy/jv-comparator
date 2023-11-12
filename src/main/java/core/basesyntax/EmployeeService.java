package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> userComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int compare = Integer.compare(o1.getAge(), o2.getAge());
                if (compare != 0) {
                    return compare;
                }
                return o1.getName().compareTo(o2.getName());
            }
        };
        Set<Employee> sortedSet = new TreeSet<>(userComparator);
        sortedSet.addAll(employees);
        return sortedSet;
    }
}
