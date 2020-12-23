package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee first, Employee second) {
            if (first.getAge() != second.getAge()) {
                return Integer.compare(first.getAge(), second.getAge());
            }
            return first.getName().compareTo(second.getName());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
