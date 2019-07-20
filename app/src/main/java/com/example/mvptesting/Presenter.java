package com.example.mvptesting;

public interface Presenter<T extends View> {

    void onAttach(T View);
    void onDetach();
}
