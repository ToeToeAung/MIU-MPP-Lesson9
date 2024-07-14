package lesson9.labs.prob4;

import java.util.stream.Stream;

public class PrimeStream {

public static void main(String[] args) {

    PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
    ps.printFirstNPrimes(10);
    System.out.println("====");
    ps.printFirstNPrimes(5);

}

    public static void printFirstNPrimes(long n){
        generatePrimeStreams()
                .limit(n)
                .forEach(System.out::println);
    }

public static Stream<Integer> generatePrimeStreams(){
    Stream<Integer> primeList=Stream.iterate(2,n-> {
        int primeNum=n+1;
        while(!isPrime(primeNum)){
            primeNum++;
        }
        return primeNum;
    });
    return primeList;
}

public static boolean isPrime(int n) {
    if(n<=1) return false;
    for(int i=2;i<= n * n;i++) {
        if(n % 2 == 0) return false;
    }
    return true;
}

}
