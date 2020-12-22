package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    Set<Employee> employeeSet;

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee employeeOne, Employee employeeTwo) {
                int compareEmployee = Integer.compare(employeeOne.getAge(), employeeTwo.getAge());
                if (compareEmployee != 0) {
                    return compareEmployee;
                }
                return employeeOne.getName().compareTo(employeeTwo.getName());
            }
        };
        employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
