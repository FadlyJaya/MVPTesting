package com.example.mvptesting;

public class MainPresenter implements Presenter<MainView> {

    MainView mView;


    public void onShowView(){

        final Data data = new Data();
        data.setText("Hello, ini data");

        mView.OnShowView(data);
    }


    @Override
    public void onAttach(MainView View) {
        mView = View;
    }

    @Override
    public void onDetach() {
        mView = null;
    }
}
