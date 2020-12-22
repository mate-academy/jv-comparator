package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee employee2, Employee employee1) {
                int compareAges = Integer.compare(employee2.getAge(), employee1.getAge());
                if (compareAges != 0) {
                    return compareAges;
                }
                return employee2.getName().compareTo(employee1.getName());
            }
        };
        Set<Employee> allEmployees = new TreeSet<>(comparator);
        allEmployees.addAll(employees);
        return allEmployees;
    }
}
