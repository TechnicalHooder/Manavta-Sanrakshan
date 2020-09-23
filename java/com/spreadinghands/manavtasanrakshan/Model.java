package com.spreadinghands.manavtasanrakshan;

import android.widget.Button;

public class Model {

    private int image;
    private String title;

    public Model(int image, String title) {
        this.image = image;
        this.title = title;
       // this.button = button;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Button getButton() {
//        return button;
//    }
//
//    public void setButton(Button button) {
//        this.button = button;
//    }
}
