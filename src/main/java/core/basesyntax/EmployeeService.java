package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = (employee1, employee2) -> {
            if (employee2.getAge() != employee1.getAge()) {
                return Integer.compare(employee1.getAge(), employee2.getAge());
            }
            return employee1.getName().compareTo(employee2.getName());
        };
        Set<Employee> employeeSet = new TreeSet<>(comparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
