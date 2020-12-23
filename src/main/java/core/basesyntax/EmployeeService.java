package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<>() {
            @Override
            public int compare(Employee employeeOne, Employee employeeTwo) {
                int comparedEmployedPersonsByAge = Integer.compare(employeeOne.getAge(),
                        employeeTwo.getAge());
                if (comparedEmployedPersonsByAge != 0) {
                    return comparedEmployedPersonsByAge;
                }
                return employeeOne.getName().compareTo(employeeTwo.getName());
            }
        };
        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
