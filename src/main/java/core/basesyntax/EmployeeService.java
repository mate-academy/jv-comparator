package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    private final Comparator<Employee> employeeComparator = new Comparator<>() {
        @Override
        public int compare(Employee user1, Employee user2) {
            if (user1.getAge() != user2.getAge()) {
                return Integer.compare(user1.getAge(), user2.getAge());
            }
            return user1.getName().compareTo(user2.getName());
        }
    };

    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        if (employees == null) {
            return null;
        }
        Set<Employee> eployeeSet = new TreeSet<>(employeeComparator);
        eployeeSet.addAll(employees);
        return eployeeSet;
    }
}
