/**
 * Created by PiratePowWow on 2/22/16.
 */
public class AnonymousFunction {
    public static void main(String[] args) {
        //Traditional - runs code from separate method
        sayHello();

        //Run code from an anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello From Anonymous Class!");
            }
        };
        r1.run();

        //Run code from an anonymous function
        Runnable r2 = () -> {
            System.out.println("Hello From Anonymous Function");
        };
        r2.run();
    }

    static void sayHello(){
        System.out.println("Hello World!");
    }
}
