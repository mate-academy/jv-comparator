package core.basesyntax;

import java.util.Comparator;

public class EmployeeByAgeAndNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() != o2.getAge()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
