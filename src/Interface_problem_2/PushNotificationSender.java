package Interface_problem_2;

public class PushNotificationSender implements NotificationSender,PushNotification{
    String s;
    @Override
    public void sendNotifications(String send) {
       s=send;
    }

    @Override
    public void pushNotifications() {
        System.out.println("Push Notification: " + s);
    }
}
