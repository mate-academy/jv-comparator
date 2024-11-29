package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private Comparator<Employee> comparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee firstEmployee, Employee secondEmployee) {

            int compareAge = Integer.compare(firstEmployee.getAge(), secondEmployee.getAge());
            if (compareAge == 0) {
                int compareName = firstEmployee.getName().compareTo(secondEmployee.getName());
                return compareName;
            }
            return compareAge;
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> treeSetSort = new TreeSet<>(comparator);
        treeSetSort.addAll(employees);
        return treeSetSort;
    }
}
