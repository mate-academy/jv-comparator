package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(final Employee o1, final Employee o2) {
                int ageComp = Integer.compare(o1.getAge(), o2.getAge());
                if (ageComp != 0) {
                    return ageComp;
                }
                return o1.getName().compareTo(o2.getName());
            }
        };
        TreeSet<Employee> employeesSort = new TreeSet<>(employeeComparator);
        employeesSort.addAll(employees);
        return employeesSort;
    }
}
