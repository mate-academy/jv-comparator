package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int comparedYears = Integer.compare(employee1.getAge(), employee2.getAge());
                if (comparedYears != 0) {
                    return comparedYears;
                }
                return employee1.getName().compareTo(employee2.getName());
            }
        };
        Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
