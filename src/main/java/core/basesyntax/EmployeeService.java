package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                int comparedAge = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
                if (comparedAge != 0) {
                    return comparedAge;
                }
                return firstEmployee.getName().compareTo(secondEmployee.getName());
            }
        };
        Set<Employee> sortedEmployeeSet = new TreeSet<>(employeeComparator);
        sortedEmployeeSet.addAll(employees);
        return sortedEmployeeSet;
    }
}
