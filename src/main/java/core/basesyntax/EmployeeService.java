package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int comparedAges = Integer.compare(employee1.getAge(), employee2.getAge());
                if (comparedAges != 0) {
                    return comparedAges;
                }
                return employee1.getName().compareTo(employee2.getName());
            }
        };
        Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
