package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee employeeFirst, Employee employeeSecond) {
                int compareAge = Integer.compare(employeeFirst.getAge(), employeeSecond.getAge());
                if (compareAge != 0) {
                    return compareAge;
                }
                return employeeFirst.getName().compareTo(employeeSecond.getName());
            }
        };
        Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
