package com.edu.app.util;

import com.edu.app.form.EduMenu;

/**
 * Created by Kumar Jeyaprakasam on 11-01-2015.
 */
public enum MenuEnum {

    HOME("/","Home", "home"),
    INSTITUTION_HOME("/institution", "Institution", "institution"),
    INSTITUTION_ADD("/institution/add", "Add", "add"),
    INSTITUTION_SEARCH("/institution/search", "Search", "search") ;

    private String url;
    private String displayText;
    private String menu;

    private  MenuEnum(String url, String displayText, String menu){
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

    public EduMenu getMenuItem(MenuEnum menuEnum){

        return new EduMenu(menuEnum.getUrl(), menuEnum.getDisplayText(), menuEnum.getMenu());
    }


}
