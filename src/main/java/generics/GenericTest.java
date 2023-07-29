package generics;

public class GenericTest {
    public static void main(String[] args) {

        // Creating an instance of MyGenericClass with Integer type
        MyGenericClass<Integer> intObject = new MyGenericClass<>(10);
        System.out.println("Integer Value: " + intObject.getData());

        // Creating an instance of MyGenericClass with String type
        MyGenericClass<String> strObject = new MyGenericClass<>("Hello, Generics!");
        System.out.println("String Value: " + strObject.getData());

        // Creating an instance of MyGenericClass with Boolean type
        MyGenericClass<Boolean> boolObject = new MyGenericClass<>(true);
        System.out.println("Boolean Value: " + boolObject.getData());

        // Modifying the data
        intObject.setData(20);
        strObject.setData("Updated Value");
        boolObject.setData(false);

        // Retrieving the modified data
        System.out.println("Modified Integer Value: " + intObject.getData());
        System.out.println("Modified String Value: " + strObject.getData());
        System.out.println("Modified Boolean Value: " + boolObject.getData());
    }
}
