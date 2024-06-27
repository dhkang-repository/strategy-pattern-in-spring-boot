package com.thegeekyasian.designpatterns.strategy.noti.strategies;

import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service(NotificationType.PUSH_NOTIFICATION)
public class PushNotificationService implements NotificationService {

  @Override
  public String sendNotification() {
    return "Sending push notification";
  }
}
