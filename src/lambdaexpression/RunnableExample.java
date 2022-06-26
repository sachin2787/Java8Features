package lambdaexpression;

/*class Task implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Child" +i);
        }
    }
}*/
public class RunnableExample {
    public static void main(String[] args) {
       Runnable r = () -> {
         for(int i = 0; i < 10; i++) {
             System.out.println("child: "+i);
         }
       };
        Thread t = new Thread(r);
        t.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Main: "+i);
        }
    }
}
