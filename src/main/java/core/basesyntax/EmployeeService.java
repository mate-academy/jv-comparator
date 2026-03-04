package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private static final int EQUALS_OF_EMPLOYEES_AGE_OR_NAME = 0;

    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                int employeesAges = Integer.compare(o1.getAge(), o2.getAge());
                if (employeesAges != EQUALS_OF_EMPLOYEES_AGE_OR_NAME) {
                    return employeesAges;
                }
                int employeeNames = o1.getName().compareTo(o2.getName());
                if (employeeNames != EQUALS_OF_EMPLOYEES_AGE_OR_NAME) {
                    return employeeNames;
                }
                return 0;
            }
        };
        Set<Employee> sortedEmployees = new TreeSet<>(comparator);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
