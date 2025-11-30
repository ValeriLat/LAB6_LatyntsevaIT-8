//2.2
public class MethodInvoker {
    private int callCount = 0;

    @Invoke
    public void executeAutomatically() {
        callCount++;
        System.out.println("Автоматический вызов метода! Count: " + callCount);
    }

    public void regularMethod() {
        System.out.println("Обычный метод");
    }

    @Invoke
    public void anotherAutoMethod() {
        System.out.println("Еще один автоматический метод");
    }

    public int getCallCount() {
        return callCount;
    }
}