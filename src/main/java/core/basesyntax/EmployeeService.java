package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class EmployeeService {
    private Comparator<Employee> injusticeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int compareAges = Integer.compare(employee1.getAge(), employee2.getAge());
            if (compareAges != 0) {
                return compareAges;
            }
            return employee1.getName().toLowerCase().compareTo(employee2.getName().toLowerCase());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        return null;
    }
}
