package lesson9.labs.prob10c;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PrintMaxMinIntegers {
    public static void main(String[] args) {
        Stream<Integer> myIntStream= Stream.of(1,2,3,4,5,4,9,-1,10,2,1);
        IntSummaryStatistics stats = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));

        int max = stats.getMax();
        int min = stats.getMin();
        System.out.println("Maximum Value :" + max);
        System.out.println("Minimum Value :" + min);
    }
}
