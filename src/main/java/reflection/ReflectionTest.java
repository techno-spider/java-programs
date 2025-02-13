package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws Exception {

        Cat myCat = new Cat("Stella", 7);

        System.out.println(myCat.getName() + " : " + myCat.getAge());

        // accessing and changing the private and final fields
        Field[] catFields = myCat.getClass()
                                 .getDeclaredFields();

        for (Field field : catFields) {
            if (field.getName()
                     .equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Jimmy");
            }
            if (field.getName()
                     .equals("age")) {
                field.setAccessible(true);
                field.set(myCat, 9);
            }
        }
        System.out.println(myCat.getName() + " : " + myCat.getAge());

        // accessing and changing the private and static methods
        Method[] catMethods = myCat.getClass()
                                   .getDeclaredMethods();

        for (Method method : catMethods) {
            //System.out.println(method.getName());
            if (method.getName()
                      .equals("privateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}
