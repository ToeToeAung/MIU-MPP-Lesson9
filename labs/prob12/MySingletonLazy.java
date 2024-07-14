package lesson9.labs.prob12;
import java.util.Optional;
public class MySingletonLazy {
    private static Optional<MySingletonLazy> instance=Optional.empty();
    private MySingletonLazy() {}
    public static MySingletonLazy getInstance() {
        if(instance.isEmpty()) {
            instance= Optional.of(new MySingletonLazy());
        }
        return instance.get();
    }
public static void main(String[] args) {
        MySingletonLazy mySingletonLazy=MySingletonLazy.getInstance();
        System.out.println("Singleton Object "+mySingletonLazy);
}
}
