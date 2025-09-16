package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeByAgeAndNameComparator = new Comparator<>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                int comparison = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
                if (comparison == 0) {
                    return firstEmployee.getName().compareTo(secondEmployee.getName());
                }
                return comparison;
            }
        };
        Set<Employee> result = new TreeSet<>(employeeByAgeAndNameComparator);
        result.addAll(employees);
        return result;
    }
}
