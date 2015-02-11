package com.edu.app.form;

import java.io.Serializable;

/**
 * Created by Kumar Jeyaprakasam on 11-01-2015.
 * To represent each Menu Item
 */
public class EduMenu implements Serializable {

    private String url;
    private String displayText;
    private String menu;


    public EduMenu() {

    }

    public EduMenu(String url, String displayText, String menu) {
        this.url = url;
        this.displayText = displayText;
        this.menu = menu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }


    @Override
    public String toString() {
        return "EduMenu{" +
                "url='" + url + '\'' +
                ", displayText='" + displayText + '\'' +
                ", menu='" + menu + '\'' +
                '}';
    }
}
