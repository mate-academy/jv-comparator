package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int agesCompared = Integer.compare(e1.getAge(), e2.getAge());
                if (agesCompared != 0) {
                    return agesCompared;
                }
                return e1.getName().compareTo(e2.getName());
            }
        };

        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
