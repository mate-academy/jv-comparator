package core.basesyntax;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int age = Integer.compare(o1.getAge(), o2.getAge());
        if (age != 0) {
            return age;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
