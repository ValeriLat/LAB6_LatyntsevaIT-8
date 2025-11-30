//Главный класс
public class Main {
    public static void main(String[] args) {
        System.out.println("Задания 1.1-6\n");

        System.out.println("1. Тест @Invoke:");
        MethodInvoker invoker = new MethodInvoker();
        InvokeHandler.executeAnnotatedMethods(invoker);
        System.out.println();

        System.out.println("2. Тест @Default:");
        DefaultHandler.showDefaultClass(DefaultTypeClass.class);
        System.out.println();

        System.out.println("3. Тест @ToString:");
        UserProfile user = new UserProfile("Alice", "pass123", 10, "SESS_999");
        System.out.println("Результат: " + ToStringHandler.buildCustomString(user));
        System.out.println();

        System.out.println("4. Тест @Validate:");
        ValidateHandler.displayValidatedClasses(ValidationContainer.class);
        System.out.println();

        System.out.println("5. Тест @Two:");
        TwoHandler.processTwoAnnotation(DoubleValueClass.class);
        System.out.println();

        System.out.println("6. Тест @Cache:");
        CacheHandler.analyzeCacheConfiguration(CacheStorage.class);
        System.out.println();

        System.out.println("Все тесты завершены!");
    }
}