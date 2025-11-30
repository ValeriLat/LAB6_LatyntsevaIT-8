//Обработчик для 1
import java.lang.reflect.Method;

public class InvokeHandler {

    public static void executeAnnotatedMethods(Object target) {
        Class<?> clazz = target.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        int executedCount = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(target);
                    executedCount++;
                    System.out.println("Выполнен метод: " + method.getName());
                } catch (Exception e) {
                    System.err.println("Ошибка при вызове метода: " + method.getName());
                }
            }
        }

        System.out.println("Всего выполнено методов: " + executedCount);
    }
}
