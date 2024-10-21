package Principle2_OpenClosedPrinciple.Example1.ProblematicCode;

import java.util.List;
                                        //OpenClosed=> open for extension, but closed for modification
//Problem => Every single time needed to modify logic in notification sender (this should not be allowed rather implement) and too many nested if else
//Solution => Make interface Notification and implement whenever similar functionalities occurs
public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();;
            } else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            } else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
        }
    }
}
