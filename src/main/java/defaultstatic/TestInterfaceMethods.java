package defaultstatic;

public class TestInterfaceMethods implements InterfaceMethods {
    @Override
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        TestInterfaceMethods st = new TestInterfaceMethods();
        st.square(3);
        // default method
        st.show();
        // static method
        InterfaceMethods.display();
    }
}
