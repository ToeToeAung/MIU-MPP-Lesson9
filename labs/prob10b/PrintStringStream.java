package lesson9.labs.prob10b;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class PrintStringStream {
    public static void main(String[] args) {
        Stream<String> stringStream=Stream.of("Bill","Thomas","Mary");
        System.out.println(stringStream.collect(Collectors.joining(",")));
    }
}
