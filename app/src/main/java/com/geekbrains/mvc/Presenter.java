package com.geekbrains.mvc;

public class Presenter {
    public enum NumBt {

        BT1(0),
        BT2(1),
        BT3(2);
        int btId;

        NumBt(int btId) {
            this.btId = btId;
        }

        public int getBtId() {
            return btId;
        }
    }

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
