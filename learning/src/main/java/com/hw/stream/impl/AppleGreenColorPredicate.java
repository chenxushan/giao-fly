package com.hw.stream.impl;

import com.hw.stream.Apple;
import com.hw.stream.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
