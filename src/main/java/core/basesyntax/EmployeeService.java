package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    Comparator<Employee> employeeComparator = new Comparator<>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int compareAges = Integer.compare(employee1.getAge(), employee2.getAge());
            if (compareAges != 0) {
                return compareAges;
            }
            return employee1.getName().compareTo(employee2.getName());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
