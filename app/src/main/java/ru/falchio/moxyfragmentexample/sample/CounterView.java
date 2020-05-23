package ru.falchio.moxyfragmentexample.sample;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface CounterView extends MvpView {
    @StateStrategyType(AddToEndSingleStrategy.class)
    void showCount(int count);
}