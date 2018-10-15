package demo49_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class<User> userClass = User.class;
        User user = new User(1, "kokos");
        Class<? extends User> uzer = user.getClass();

//        Field[] fields = uzer.getDeclaredFields();
//        for (Field field : fields) {
//            field.setAccessible(true);
//            System.out.println(field.getName() + " " + field.get(user) + " " + field.getType());
//        }


//        Method[] methods = uzer.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName() + " " + method.getParameterCount() + " " + method.getReturnType());
//            Parameter[] parameters = method.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println(parameter.getName() + " " + parameter.getType());
//            }
//            System.out.println("|--------------|");
//        }

//        Class<?>[] interfaces = uzer.getInterfaces();
//        for (Class<?> anInterface : interfaces) {
//            System.out.println(anInterface.getName());
//        }

//        System.out.println(user);
//        Field id = uzer.getDeclaredField("id");
//        id.setAccessible(true);
//        id.set(user, 100);
//        System.out.println(user);

        Class<User> userClass = User.class;

        Constructor<User> constructor = userClass.getConstructor(Integer.TYPE, String.class);
        User instance = constructor.newInstance(1000, "ashfdhsagfd");
        System.out.println(instance);


    }
}
