package demo50_annotations;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {


        User user = new User(-100, "kokos");
        try {
            validate(user);
            System.out.println(user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static void validate(User user) throws IllegalAccessException {
        Class<? extends User> aClass = user.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(ValidateIntID.class)) {
                int currentID = (int) field.get(user);
                if (currentID < 0) {
                    ValidateIntID annotation = field.getAnnotation(ValidateIntID.class);
                    int defID = annotation.defID();
                    field.set(user, defID);


                }
            }
        }

    }
}
