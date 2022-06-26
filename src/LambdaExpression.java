interface A {
    public void m1();
}
/*lass Demo implements A {
    public void m1() {
        System.out.println("Hello");
    }
}*/
public class LambdaExpression {
    public static void main(String[] args) {
      /*  A a = new Demo();
        a.m1();*/
        A a = () -> System.out.println("Hello");
        a.m1();
    }
}
