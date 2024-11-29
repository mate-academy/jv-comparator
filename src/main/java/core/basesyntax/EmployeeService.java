package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                int compareAges = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
                if (compareAges != 0) {
                    return compareAges;
                }
                return firstEmployee.getName().compareTo(secondEmployee.getName());
            }
        };
        Set<Employee> allEmployees = new TreeSet<>(comparator);
        allEmployees.addAll(employees);
        return allEmployees;
    }
}
