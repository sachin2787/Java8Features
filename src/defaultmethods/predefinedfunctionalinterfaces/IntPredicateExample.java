package defaultmethods.predefinedfunctionalinterfaces;

import java.util.function.IntPredicate;

public class IntPredicateExample {
    public static void main(String[] args) {
        IntPredicate ip = i -> i % 2 ==0;
        System.out.println(ip.test(56));
        System.out.println(ip.test(67));
    }
}
