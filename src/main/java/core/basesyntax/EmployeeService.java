package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> compareEmployees = new Comparator<>() {
            @Override
            public int compare(Employee firstEmployee, Employee secondEmployee) {
                int comparedAges = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
                if (comparedAges != 0) {
                    return comparedAges;
                }
                return firstEmployee.getName().compareTo(secondEmployee.getName());
            }
        };
        Set<Employee> employeesSet = new TreeSet<>(compareEmployees);
        employeesSet.addAll(employees);
        return employeesSet;
    }
}
