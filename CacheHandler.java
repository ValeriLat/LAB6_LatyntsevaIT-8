//Обработчик для 6
public class CacheHandler {

    public static void analyzeCacheConfiguration(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(Cache.class)) {
            System.out.println("Аннотация @Cache отсутствует");
            return;
        }

        Cache annotation = clazz.getAnnotation(Cache.class);
        String[] cacheNames = annotation.cacheNames();

        System.out.println("Конфигурация кеша:");
        if (cacheNames.length == 0) {
            System.out.println("  Кеширование отключено (нет областей)");
        } else {
            System.out.println("  Области кеширования:");
            for (int i = 0; i < cacheNames.length; i++) {
                System.out.println("    " + (i + 1) + ". " + cacheNames[i]);
            }
        }
    }
}
