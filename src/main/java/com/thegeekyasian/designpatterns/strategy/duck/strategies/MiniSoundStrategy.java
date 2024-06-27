package com.thegeekyasian.designpatterns.strategy.duck.strategies;

import org.springframework.stereotype.Service;

@Service(SoundType.MINI)
public class MiniSoundStrategy implements SoundStrategy {
    @Override
    public String makeSound(String soundType) {
        return soundType;
    }
}
