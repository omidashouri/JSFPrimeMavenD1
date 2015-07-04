package ir.jsfturial.video;

import javax.annotation.PostConstruct;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by ashouri on 6/30/2015.
 */
@Named
@RequestScoped
public class SpinnerBean implements Serializable{

    @Inject
    private Spinner spinnerii;
    private String name;
    private String family;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Spinner getSpinnerii() {
        return spinnerii;
    }

    public void setSpinnerii(Spinner spinnerii) {
        this.spinnerii = spinnerii;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @PostConstruct
    public void init() {
        this.setName("omid");
        this.setFamily("ashouri");

    }

    public void convertCalc(){

        this.setAge(this.getSpinnerii().getMyValue()+1000);

        System.out.println("wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwww");
    }




}
