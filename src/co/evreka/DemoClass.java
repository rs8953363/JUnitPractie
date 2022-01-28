package co.evreka;

import org.junit.runner.*;
import org.junit.runner.notification.*;

public class DemoClass {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitClass.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
            System.out.println("Result==" +result.wasSuccessful());
        }
    }
}
