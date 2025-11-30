//Обработчик для 5
public class TwoHandler {

    public static void processTwoAnnotation(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(Two.class)) {
            System.out.println("Аннотация @Two не найдена");
            return;
        }

        Two annotation = clazz.getAnnotation(Two.class);
        System.out.println("Параметры аннотации @Two:");
        System.out.println("  Текст: '" + annotation.textData() + "'");
        System.out.println("  Число: " + annotation.numberData());

        if (annotation.textData().isEmpty() || annotation.numberData() < 0) {
            System.out.println("  ⚠ Внимание: параметры могут быть некорректными");
        }
    }
}