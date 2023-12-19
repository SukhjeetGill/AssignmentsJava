package Interface_problem_2;

public class EmailNotificationSender implements NotificationSender,EmailNotification{
    String recipient;

    @Override
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    @Override
    public void sendNotifications(String send){
        System.out.println("Message: "+ send);
        System.out.println("Email : " + recipient);
    }
}
