package com.thegeekyasian.designpatterns.strategy.noti.strategies;

import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service(NotificationType.SMS)
public class SmsNotificationService implements NotificationService {

  @Override
  public String sendNotification() {
    return "Sending SMS";
  }
}
