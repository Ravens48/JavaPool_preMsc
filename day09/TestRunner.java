import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public void runTest(Class <?> cTest) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = cTest.getDeclaredMethods();
        for (Method method: methods) {
            if(method.isAnnotationPresent(Test.class) && method.getAnnotation(Test.class).enabled()) {
                    Test test = method.getAnnotation(Test.class);
                    System.out.println(test.name());
                    Method m = method.("displayInformations");
                    method.invoke();
            }
        }
    }
}
