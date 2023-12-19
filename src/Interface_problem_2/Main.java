package Interface_problem_2;

public class Main {
    public static void main(String[] args) {
        PushNotificationSender pushNotificationSender = new PushNotificationSender();
        EmailNotificationSender emailNotificationSender = new EmailNotificationSender();
        SMSNotificationSender smsNotificationSender = new SMSNotificationSender();
        emailNotificationSender.setRecipient("John@gmail.com");
        emailNotificationSender.sendNotifications("Hello via email");
        System.out.println("                                                            *********              ");
        smsNotificationSender.setPhoneNumber("9399093465");
        smsNotificationSender.sendNotifications("Hello via sms");
        System.out.println("                                                            *********              ");
        pushNotificationSender.sendNotifications("Hello via push");
        pushNotificationSender.pushNotifications();
    }
}
