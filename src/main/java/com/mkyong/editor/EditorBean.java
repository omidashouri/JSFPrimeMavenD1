package com.mkyong.editor;

import javax.inject.Named;

/**
 * Created by ashouri on 6/30/2015.
 */
@Named
public class EditorBean {

    private String value = "This editor is provided by PrimeFaces";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
