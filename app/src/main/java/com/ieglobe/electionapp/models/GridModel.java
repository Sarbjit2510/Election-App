package com.ieglobe.electionapp.models;

/**
 * Created by pawneshwer on 11-Jun-16.
 */
public class GridModel {
    public int icon;
    public String text;
    public GridModel(){

    }
    public GridModel(int icon, String text){
        this.icon = icon;
        this.text = text;
    }
    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
