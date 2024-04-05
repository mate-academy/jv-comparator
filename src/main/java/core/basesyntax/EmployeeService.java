package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int employeesCompared = Integer.compare(o1.getAge(), o2.getAge());
            if (employeesCompared != 0) {
                return employeesCompared;
            }
            return o1.getName().compareTo(o2.getName());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> orderedEmployees = new TreeSet<>(employeeComparator);
        orderedEmployees.addAll(employees);
        return orderedEmployees;
    }
}
