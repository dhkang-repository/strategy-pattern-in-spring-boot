package com.thegeekyasian.designpatterns.strategy.duck.strategies;

import org.springframework.stereotype.Service;

@Service(SoundType.MODEL)
public class ModelSoundStrategy implements SoundStrategy{

    @Override
    public String makeSound(String soundType) {
        return soundType;
    }
}
