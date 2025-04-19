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
                int ageCompares = o1.getName().compareTo(o2.getName());
                if (ageCompares != 0) {
                    return ageCompares;
                }
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);

        return employeeSet;
    }
}
