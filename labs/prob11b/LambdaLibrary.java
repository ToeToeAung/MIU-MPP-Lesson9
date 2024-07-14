package lesson9.labs.prob11b;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class LambdaLibrary {
    public static final Function<List<Employee>,String> getEmployee = employees ->  {
       return employees.stream()
                .filter(e -> e.getSalary() > 100000)
                .filter(e -> e.getFirstName().charAt(0) > 'M')
                .sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .collect(Collectors.joining(", "));

    };

}
