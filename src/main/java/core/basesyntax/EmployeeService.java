package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                if (firstEmployee.getAge() != secondEmployee.getAge()) {
                    return firstEmployee.getAge() - secondEmployee.getAge();
                }
                return firstEmployee.getName().compareTo(secondEmployee.getName());
            }
        };

        Set<Employee> employeeSet = new TreeSet<>(comparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
