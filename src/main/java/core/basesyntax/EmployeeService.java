package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                int comparison = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
                if (comparison == 0) {
                    return firstEmployee.getName().compareTo(secondEmployee.getName());
                }
                return comparison;
            }
        };
        Set<Employee> result = new TreeSet<>(employeeComparator);
        result.addAll(employees);
        return result;
    }
}
