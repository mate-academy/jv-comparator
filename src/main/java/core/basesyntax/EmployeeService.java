package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee worker1, Employee worker2) {
                int comparedAge = Integer.compare(worker1.getAge(), worker2.getAge());
                if (comparedAge != 0) {
                    return comparedAge;
                }
                return worker1.getName().compareTo(worker2.getName());
            }
        };
        Set<Employee> employByOrder = new TreeSet<>(employeeComparator);
        employByOrder.addAll(employees);
        return employByOrder;
    }
}
