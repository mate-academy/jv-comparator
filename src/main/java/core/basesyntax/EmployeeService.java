package core.basesyntax;

import java.util.*;

public class EmployeeService {

    public Set<Employee> getEmployByOrder(List<Employee> employees) {

        Comparator<Employee> employeeComparator = new Comparator<Employee>() {

            @Override
            public int compare(Employee employee1, Employee employee2) {
                int compareAge = Integer.compare(employee1.getAge(), employee2.getAge());

                if (compareAge == 0) {
                    return employee1.getName().compareTo(employee2.getName());
                }
                    return Integer.compare(employee1.getAge(), employee2.getAge());
            }
        };
        Set<Employee> employeeSet = new TreeSet<Employee>(employeeComparator);
        employeeSet.addAll(employees);

        return employeeSet;
    }
}
