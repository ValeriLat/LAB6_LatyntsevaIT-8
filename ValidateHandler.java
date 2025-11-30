//Обработчик для 4
public class ValidateHandler {

    public static void displayValidatedClasses(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(Validate.class)) {
            System.out.println("Аннотация @Validate не обнаружена");
            return;
        }

        Validate annotation = clazz.getAnnotation(Validate.class);
        Class<?>[] classes = annotation.validatedClasses();

        System.out.println("Список классов для валидации:");
        if (classes.length == 0) {
            System.out.println("  (список пуст)");
        } else {
            for (Class<?> validatedClass : classes) {
                System.out.println("  • " + validatedClass.getSimpleName());
            }
        }
        System.out.println("Всего классов: " + classes.length);
    }
}