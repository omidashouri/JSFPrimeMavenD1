package com.jsfprohtml5.firstapplication.model;

import java.io.Serializable;

/**
 * Created by ashouri on 7/15/2015.
 */
public class HeaderObject implements Serializable {

    private String hKey;
    private String hValue;

    public HeaderObject(String k,String v){
        sethKey(k);
        sethValue(v);
    }

    public String gethKey() {
        return hKey;
    }

    public void sethKey(String hKey) {
        this.hKey = hKey;
    }

    public String gethValue() {
        return hValue;
    }

    public void sethValue(String hValue) {
        this.hValue = hValue;
    }
}
