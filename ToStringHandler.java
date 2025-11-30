//Обработчик для 3
import java.lang.reflect.Field;

public class ToStringHandler {

    public static String buildCustomString(Object obj) {
        Class<?> clazz = obj.getClass();
        StringBuilder result = new StringBuilder();

        boolean classIncluded = true;
        if (clazz.isAnnotationPresent(ToString.class)) {
            ToString classAnnotation = clazz.getAnnotation(ToString.class);
            classIncluded = (classAnnotation.show() == ToString.ShowField.YES);
        }

        if (!classIncluded) {
            return clazz.getSimpleName() + "{скрыто}";
        }

        result.append(clazz.getSimpleName()).append("{");

        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            field.setAccessible(true);

            boolean includeField = true;
            if (field.isAnnotationPresent(ToString.class)) {
                ToString fieldAnnotation = field.getAnnotation(ToString.class);
                includeField = (fieldAnnotation.show() == ToString.ShowField.YES);
            }

            if (includeField) {
                if (!firstField) {
                    result.append(", ");
                }

                try {
                    result.append(field.getName()).append("=").append(field.get(obj));
                    firstField = false;
                } catch (IllegalAccessException e) {
                    result.append(field.getName()).append("=недоступно");
                }
            }
        }

        result.append("}");
        return result.toString();
    }
}