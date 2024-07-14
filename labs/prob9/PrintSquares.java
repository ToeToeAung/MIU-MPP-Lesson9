package lesson9.labs.prob9;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class PrintSquares {
    public static void main(String[] args) {
        printSquares(4);
    }

    public  static void printSquares(int n) {
        IntStream.iterate(1, i -> i +1)
                .limit(n)
                .map(i -> i * i)
                .forEach(i -> System.out.print(i + " "));
    }
}
