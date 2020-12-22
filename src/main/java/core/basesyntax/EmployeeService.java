package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int howIsYonger = Integer.compare(o1.getAge(), o2.getAge());
            if (howIsYonger != 0) {
                return howIsYonger;
            }
            return o1.getName().compareTo(o2.getName());
        }

    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> resultSet = new TreeSet<>(employeeComparator);
        resultSet.addAll(employees);
        return resultSet;
    }
}
