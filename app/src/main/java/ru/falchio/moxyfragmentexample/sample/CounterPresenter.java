package ru.falchio.moxyfragmentexample.sample;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.falchio.moxyfragmentexample.sample.CounterView;

@InjectViewState
public class CounterPresenter extends MvpPresenter<CounterView> {
    private int mCount;

    public CounterPresenter() {
        getViewState().showCount(mCount);
    }

    public void onPlusClick() {
        mCount++;
        getViewState().showCount(mCount);
    }
}