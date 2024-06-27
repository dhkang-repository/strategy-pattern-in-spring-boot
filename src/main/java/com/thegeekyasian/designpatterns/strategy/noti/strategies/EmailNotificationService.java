package com.thegeekyasian.designpatterns.strategy.noti.strategies;

import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service(NotificationType.EMAIL)
public class EmailNotificationService implements NotificationService {

  @Override
  public String sendNotification() {
    return "Sending email";
  }
}
