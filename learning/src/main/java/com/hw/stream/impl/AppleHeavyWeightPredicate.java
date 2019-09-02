package com.hw.stream.impl;

import com.hw.stream.Apple;
import com.hw.stream.ApplePredicate;
public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return apple.getWeight() > 150;
    }
}
