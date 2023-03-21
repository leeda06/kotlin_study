package kotlin_20230321;

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public String method(Integer i) {
        return "Hello";
    }
}

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface m1 = new MyFunctionalInterface() {
            @Override
            public String method(Integer i) {
                return "Hello " + i;
            }
        };
        System.out.printf(m1.method(100));

        MyFunctionalInterface m2 = (i) -> {
            return "Hello " + i;
        };

        MyFunctionalInterface m3 = (i) -> "Hello " + i;
    }
}
