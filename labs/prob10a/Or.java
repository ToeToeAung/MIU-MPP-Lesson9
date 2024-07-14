package lesson9.labs.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(false));
		boolean flag=someSimpleIsTrue(list);
		System.out.println(flag);
	}
	
	public static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
				.map(Simple::getFlag)
				.reduce(false,(x,y) -> x || y);
	}

}
