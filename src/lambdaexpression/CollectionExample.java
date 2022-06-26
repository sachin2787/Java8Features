package lambdaexpression;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(20);
        intList.add(30);
        intList.add(0);
        intList.add(25);
        intList.add(6);
        intList.add(35);
       // Collections.sort(intList);
       /* Collections.sort(intList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });*/
        Collections.sort(intList, (o1, o2) -> o2.compareTo(o1));
        System.out.println(intList);
    }
}
