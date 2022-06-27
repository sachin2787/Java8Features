package defaultmethods.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> t = i -> i % 2 == 0;
        System.out.println(t.test(10));
        System.out.println(t.test(13));
        System.out.println(t.test(500));
    }
}
