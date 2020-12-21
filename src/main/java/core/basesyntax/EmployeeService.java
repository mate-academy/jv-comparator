package core.basesyntax;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> employByOrder = new TreeSet<>((first, second) -> {
            int younger = first.getAge() - second.getAge();
            if (younger == 0) {
                return first.getName().compareTo(second.getName());
            }
            return younger;
        });
        employByOrder.addAll(employees);
        return employByOrder;
    }
}
