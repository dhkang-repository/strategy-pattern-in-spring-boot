package com.thegeekyasian.designpatterns.strategy;

import com.thegeekyasian.designpatterns.strategy.duck.factories.SoundFactory;
import com.thegeekyasian.designpatterns.strategy.duck.strategies.SoundType;
import com.thegeekyasian.designpatterns.strategy.noti.factories.NotificationFactory;
import com.thegeekyasian.designpatterns.strategy.noti.strategies.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class AllExecutors {
    private final SoundFactory soundFactory;
    private final NotificationFactory notificationFactory;


    @PostConstruct
    public void post() {
        System.out.println("ALL : " + soundFactory.execute(SoundType.MINI));
        System.out.println("ALL : " + notificationFactory.execute(NotificationType.PUSH_NOTIFICATION));
    }
}
