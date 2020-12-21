package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int comparedAges = Integer.compare(employee1.getAge(), employee2.getAge());
            if (comparedAges != 0) {
                return comparedAges;
            }
            return employee1.getName().compareTo(employee2.getName());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> orderedSet = new TreeSet<>(employeeComparator);
        orderedSet.addAll(employees);
        return orderedSet;
    }
}
