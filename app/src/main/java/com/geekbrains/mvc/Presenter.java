package com.geekbrains.mvc;

public class Presenter {

    private final Model mModel;
    private final MainView mView;

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(int id) {
        int newModelValue;
        newModelValue = calcNewModelValue(id);
        mModel.setElementValueAtIndex(id, newModelValue);
        mView.setButtonText(id + 1, newModelValue);
    }
}
