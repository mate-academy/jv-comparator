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
                int ageComparison = Integer.compare(o1.getAge(), o2.getAge());
                if (ageComparison != 0) {
                    return ageComparison;
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        };

        Set<Employee> sortedSetOfEmployee = new TreeSet<>(employeeComparator);
        sortedSetOfEmployee.addAll(employees);
        return sortedSetOfEmployee;
    }
}
