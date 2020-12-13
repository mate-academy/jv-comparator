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
                int compareByAge = Integer.compare(employee1.getAge(), employee2.getAge());
                if (compareByAge != 0) {
                    return compareByAge;
                }
                return employee1.getName().compareTo(employee2.getName());
            }
        };
        Set<Employee> setOfEmployees = new TreeSet<>(comparator);
        setOfEmployees.addAll(employees);
        return setOfEmployees;
    }
}
