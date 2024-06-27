package com.thegeekyasian.designpatterns.strategy.duck.strategies;

@FunctionalInterface
public interface SoundStrategy {
    String makeSound(String t);
}
