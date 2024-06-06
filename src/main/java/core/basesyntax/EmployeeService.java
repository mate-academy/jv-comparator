package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    private static class EmployeeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int ageComparison = Integer.compare(employee1.getAge(), employee2.getAge());
            if (ageComparison != 0) {
                return ageComparison;
            }
            return employee1.getName().compareTo(employee2.getName());
        }
    }

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> sortedEmployees = new TreeSet<>(new EmployeeComparator());
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
