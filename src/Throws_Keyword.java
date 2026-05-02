import java.io.FileNotFoundException;

public class Throws_Keyword {
    public static void main(String[] args)throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException{
        method2();
    }
    public static void method2() throws FileNotFoundException{
        method3();
    }
    public static void method3() throws FileNotFoundException{
     throw new FileNotFoundException();
    }

}

/* Throws keyword is used to make the calling member responsible to handle the Exception

So, here is a "STACK TRACE" showing complete details of the Exception.

throw keyword is used to forcefully throw an exception.
 */
