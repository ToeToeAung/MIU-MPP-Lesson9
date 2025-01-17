package lesson9.labs.prob11a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lesson9.labs.prob11a.Employee;
import lesson9.labs.prob11a.TriFunction;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));


		String printResult = emps.stream()
				.filter(e -> e.getSalary() > 100000)
				.filter(e -> e.getFirstName().charAt(0) > 'M')
				.sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
				.map(e -> e.getFirstName() + " " + e.getLastName())
				.collect(Collectors.joining(", "));

		System.out.println(printResult);
	}
}