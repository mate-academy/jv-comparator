package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                if (employee1.getAge() - employee2.getAge() != 0) {
                    return employee1.getAge() - employee2.getAge();
                } else {
                    int compare = employee1.getName().compareTo(employee2.getName());
                    return compare;
                }
            }
        };
        Set<Employee> set = new TreeSet<>(comparator);
        set.addAll(employees);
        return set;
    }
}
