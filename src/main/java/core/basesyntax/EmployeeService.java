package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private final Comparator<Employee> ageNameComparator = new Comparator<>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int namesComparisonResult =
                    Integer.compare(employee1.getAge(), employee2.getAge());
            if (namesComparisonResult != 0) {
                return namesComparisonResult;
            }
            return employee1.getName().compareTo(employee2.getName());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> sortedSet = new TreeSet<>(ageNameComparator);
        sortedSet.addAll(employees);
        return sortedSet;
    }
}
