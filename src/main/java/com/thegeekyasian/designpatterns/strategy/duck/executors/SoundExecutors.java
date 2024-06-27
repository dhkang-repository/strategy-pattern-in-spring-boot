package com.thegeekyasian.designpatterns.strategy.duck.executors;

import com.thegeekyasian.designpatterns.strategy.duck.factories.SoundFactory;
import com.thegeekyasian.designpatterns.strategy.duck.strategies.SoundType;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SoundExecutors {
    private final SoundFactory soundFactory;

    public SoundExecutors(SoundFactory soundFactory) {
        this.soundFactory = soundFactory;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println(this.soundFactory.execute(SoundType.MINI));
    }
}
