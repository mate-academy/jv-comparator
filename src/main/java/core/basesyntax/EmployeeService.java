package core.basesyntax;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {

        Set<Employee> sortedEmployees = new TreeSet<>((e1, e2) -> {
            int ageCompare = Integer.compare(e1.getAge(), e2.getAge());
            if (ageCompare != 0) {
                return ageCompare; // młodszy pierwszy
            }
            return e1.getName().compareTo(e2.getName()); // alfabetycznie jeśli wiek taki sam
        });

        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
