package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int compareAge = Integer.compare(employee1.getAge(), employee2.getAge());
                if (compareAge != 0) {
                    return compareAge;
                }
                return employee1.getName().compareTo(employee2.getName());
            }
        };
        TreeSet<Employee> sortedEmployee = new TreeSet<>(employeeComparator);
        sortedEmployee.addAll(employees);
        return sortedEmployee;
    }
}
