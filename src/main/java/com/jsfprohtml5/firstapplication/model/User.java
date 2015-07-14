package com.jsfprohtml5.firstapplication.model;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ashouri on 7/7/2015.
 */
@Named
@RequestScoped
public class User implements Serializable {
    private String name;
    private String password;
    private Map<String,String> headerList;


    public void init(){
        headerList = new HashMap<String, String>();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().getRequestHeaderMap().forEach((k,v)->headerList.put(k.toString(),v.toString()));
        headerList.forEach((k,v)->System.out.println("Key:"+k.toString()+",Value:"+v.toString()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
