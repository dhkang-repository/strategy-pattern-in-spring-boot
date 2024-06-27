package com.thegeekyasian.designpatterns.strategy.duck.factories;

import com.thegeekyasian.designpatterns.strategy.duck.strategies.SoundStrategy;
import com.thegeekyasian.designpatterns.strategy.duck.strategies.SoundType;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SoundFactory {
    private final Map<String, SoundStrategy> soundStrategyMap;

    public SoundFactory(Map<String, SoundStrategy> soundStrategyMap) {
        this.soundStrategyMap = soundStrategyMap;
    }

    public SoundStrategy getSoundStrategy(String soundType) {
        return soundStrategyMap.getOrDefault(soundType, soundStrategyMap.get(SoundType.MINI));
    }

    public String execute(String soundType) {
        SoundStrategy soundStrategy = getSoundStrategy(soundType);
        return soundStrategy.makeSound(soundType);
    }
}
