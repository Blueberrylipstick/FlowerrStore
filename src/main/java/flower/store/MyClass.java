package flower.store;

import java.lang.reflect.Field;

public class MyClass {
    private int field1;
    private String field2;
    private double field3;

    public static void main(String[] args) {
        MyClass instance = new MyClass();

        Class<?> clazz = instance.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
        }
    }
}

