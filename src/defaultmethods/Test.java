package defaultmethods;

interface A {
    default public void m1() {
        System.out.println("A");
    }
}

interface B {
    default public void m1() {
        System.out.println("B");
    }
}
public class Test implements  A, B{

    @Override
    public void m1() {
       System.out.println("Test");
        A.super.m1();
        B.super.m1();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();

    }
}
