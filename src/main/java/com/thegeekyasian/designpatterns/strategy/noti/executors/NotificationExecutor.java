package com.thegeekyasian.designpatterns.strategy.noti.executors;

import com.thegeekyasian.designpatterns.strategy.noti.factories.NotificationFactory;
import com.thegeekyasian.designpatterns.strategy.noti.strategies.NotificationType;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service
public class NotificationExecutor {
  private final NotificationFactory notificationFactory;

  public NotificationExecutor(NotificationFactory notificationFactory) {
    this.notificationFactory = notificationFactory;
  }

  @PostConstruct
  public void test() {
    System.out.println(notificationFactory.execute(NotificationType.EMAIL)); // prints `Sending email`
    System.out.println(notificationFactory.execute(NotificationType.PUSH_NOTIFICATION)); // prints `Sending push notification`
    System.out.println(notificationFactory.execute(NotificationType.SMS)); // prints `Sending SMS`
  }
}