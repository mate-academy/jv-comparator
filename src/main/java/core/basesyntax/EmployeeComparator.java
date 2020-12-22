package core.basesyntax;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        int compareAge = Integer.compare(employee1.getAge(), employee2.getAge());
        if (compareAge != 0) {
            return compareAge;
        }

        return employee1.getName().compareTo(employee2.getName());
    }
}
