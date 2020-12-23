package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                int howIsYonger = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
                if (howIsYonger != 0) {
                    return howIsYonger;
                }
                return firstEmployee.getName().compareTo(secondEmployee.getName());
            }

        };
        Set<Employee> resultSet = new TreeSet<>(employeeComparator);
        resultSet.addAll(employees);
        return resultSet;
    }
}
