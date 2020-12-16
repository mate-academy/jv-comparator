package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                int compare = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
                if (compare != 0) {
                    return compare;
                }
                return firstEmployee.getName().compareTo(secondEmployee.getName());
            }
        };
        Set<Employee> allEmployees = new TreeSet<>(comparator);
        allEmployees.addAll(employees);
        return allEmployees;
    }
}
