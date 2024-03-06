package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private static final Comparator<Employee> AGE_NAME_COMPARATOR = new Comparator<>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge() != o2.getAge()) {
                return o1.getAge() - o2.getAge();
            }
            return o1.getName().compareTo(o2.getName());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        TreeSet<Employee> sortedEmployees = new TreeSet<>(AGE_NAME_COMPARATOR);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
