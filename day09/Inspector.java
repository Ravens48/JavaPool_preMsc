import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.*;
import java.util.Arrays;

public class Inspector<T> {
    private Class<T> inspectedClass;
    public Inspector(Class<T> inspected){
        this.inspectedClass = inspected;
    }

    @Test(name = "displayInformations")
    public void displayInformations() {
        Method[] methods = this.inspectedClass.getDeclaredMethods();
        Field[] fields = this.inspectedClass.getDeclaredFields();
        int method_length = methods.length;
        int field_length = fields.length;
        System.out.println("Information of the "+ '"'+ this.inspectedClass.getTypeName()+'"'+" class:");
        System.out.println("Superclass: "+ this.inspectedClass.getSuperclass().getName());
        System.out.println(method_length + " methods:");
        for (Method method: methods) {
            System.out.println("- " + method.getName());
        }
        System.out.println( field_length+" fields:");
        for (Field field: fields) {
            System.out.println("- "+ field.getName());
        }
    }

    @Test(name = "createInstance")
    public T createInstance() throws Exception {
        return this.inspectedClass.getDeclaredConstructor().newInstance();
    }
}
