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
    private Map<String,String> headerMap;
    private List<HeaderObject> headerList;
    private List<Map.Entry<String,String>> listMap;


    @PostConstruct
    public void init(){
        headerMap = new HashMap<String, String>();
        headerList = new ArrayList<>();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().getRequestHeaderMap().forEach((k, v) -> headerMap.put(k.toString(), v.toString()));
        headerMap.forEach((k, v) -> System.out.println("Key:" + k.toString() + ",Value:" + v.toString()));
        headerMap.forEach((k, v) -> headerList.add(new HeaderObject(k, v)));
//        headerMap.forEach((k,v)->listMap.add(k.toString(),v.toString()));
        listMap = new ArrayList<>(headerMap.entrySet());

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

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public void setHeaderMap(Map<String, String> headerMap) {
        this.headerMap = headerMap;
    }

    public List<HeaderObject> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<HeaderObject> headerList) {
        this.headerList = headerList;
    }

    public List<Map.Entry<String, String>> getListMap() {
        return listMap;
    }

    public void setListMap(List<Map.Entry<String, String>> listMap) {
        this.listMap = listMap;
    }
}
