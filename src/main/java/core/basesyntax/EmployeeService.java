package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    private final Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
            if (ageCompare != 0) {
                return ageCompare;
            }
            return o1.getName().compareTo(o2.getName());
        }
    };

        public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
            Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
            sortedEmployees.addAll(employees);
            return sortedEmployees;
        }
}

