package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {

        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int agesCompared = Integer.compare(o1.getAge(), o2.getAge());
                if (agesCompared == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return agesCompared;
            }
        };

        Set<Employee> sortedSet = new TreeSet<>(employeeComparator);
        sortedSet.addAll(employees);

        return sortedSet;
    }
}
