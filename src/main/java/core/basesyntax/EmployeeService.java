package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        TreeSet<String> compareAlphabetically = new TreeSet<>();
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                compareAlphabetically.clear();
                int ageDifference = Integer.compare(o1.getAge(), o2.getAge());
                if (ageDifference == 0) {
                    compareAlphabetically.add(o1.getName());
                    compareAlphabetically.add(o2.getName());
                    if (compareAlphabetically.first().equals(o1.getName())) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }

}
