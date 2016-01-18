import java.util.Scanner;

/**
 * @author Created by sierisimo on 15/01/16. Originally for java
 */
public class StaticTest {
    public static final String name;

    static {
        Scanner t = new Scanner(System.in);
        name = t.next();
    }
    public void doSomething(){

    }
}
