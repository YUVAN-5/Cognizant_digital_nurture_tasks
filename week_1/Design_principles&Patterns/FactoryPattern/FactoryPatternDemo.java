
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("EMAIL");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("SMS");
        n2.notifyUser();

        Notification n3 = NotificationFactory.createNotification("PUSH");
        n3.notifyUser();
    }
}
