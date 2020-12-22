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
                if (employee1.getAge() != employee2.getAge()) {
                    return Integer.compare(employee1.getAge(), employee2.getAge());
                }
                int comparedNames = employee1.getName().compareTo(employee2.getName());
                return comparedNames;
            }
        };
        Set<Employee> resultEmloyees = new TreeSet<>(comparator);
        resultEmloyees.addAll(employees);
        return resultEmloyees;
    }
}
