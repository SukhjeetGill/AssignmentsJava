package Interface_problem_2;

public class SMSNotificationSender implements NotificationSender,SMSNotification {
    String num;

    @Override
    public void setPhoneNumber(String num) {
        this.num = num;
    }

    @Override
    public void sendNotifications(String send) {
        System.out.println("Message:" + send );
        System.out.println("Phone number: " + num);
    }

}
