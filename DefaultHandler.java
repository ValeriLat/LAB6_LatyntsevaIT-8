//Обработчик для 2
public class DefaultHandler {

    public static void showDefaultClass(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Default.class)) {
            Default annotation = clazz.getAnnotation(Default.class);
            System.out.println("Указанный класс по умолчанию: " + annotation.defaultClass().getName());
        } else {
            System.out.println("Аннотация @Default отсутствует");
        }
    }
}
