package defaultmethods.predefinedfunctionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> bc = (firstName, lastName) -> System.out.println(firstName+ " "+lastName);
        bc.accept("Sachin", "Jadhav");
        bc.accept("Monika", "Jadhav");
    }
}
