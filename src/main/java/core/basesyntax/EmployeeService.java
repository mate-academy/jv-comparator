package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int compare = Integer.compare(employee1.getAge(), employee2.getAge());
            if (compare != 0) {
                return compare;
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
