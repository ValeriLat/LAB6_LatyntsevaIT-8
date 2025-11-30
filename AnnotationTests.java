//Тесты для 2.2 и 2.3
public class AnnotationTests {

    public static void main(String[] args) {
        testInvokeAnnotation();
        testDefaultAnnotation();
        System.out.println("Все тесты прошли успешно!");
    }

    static void testInvokeAnnotation() {
        System.out.println("Тест @Invoke (2.2)");
        MethodInvoker methodInvoker = new MethodInvoker();
        int initialCount = methodInvoker.getCallCount();

        InvokeHandler.executeAnnotatedMethods(methodInvoker);

        if (methodInvoker.getCallCount() <= initialCount) {
            throw new AssertionError("Методы с @Invoke не были вызваны");
        }
        System.out.println("@Invoke тест пройден");
    }

    static void testDefaultAnnotation() {
        System.out.println("\nТест @Default (2.3)");

        Default annotation = DefaultTypeClass.class.getAnnotation(Default.class);
        if (annotation == null) {
            throw new AssertionError("Аннотация @Default не найдена");
        }

        if (!Integer.class.equals(annotation.defaultClass())) {
            throw new AssertionError("Неправильный класс по умолчанию");
        }

        DefaultHandler.showDefaultClass(DefaultTypeClass.class);
        System.out.println("@Default тест пройден");
    }
}