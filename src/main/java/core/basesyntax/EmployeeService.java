package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private final Comparator<Employee> employeeComparator;

    public EmployeeService() {
        employeeComparator = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int agesCompared = Integer.compare(o1.getAge(), o2.getAge());

                if (agesCompared != 0) {
                    return agesCompared;
                }

                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
