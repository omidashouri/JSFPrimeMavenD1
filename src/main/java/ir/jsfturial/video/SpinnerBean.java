package ir.jsfturial.video;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
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


    private int s;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = 100000;
    }

/*    public Spinner getSpinnerii() {
        return spinnerii;
    }

    public void setSpinnerii(Spinner spinnerii) {
        this.spinnerii = spinnerii;
    }*/

    @PostConstruct
    public void init() {
//        spinnerii.setMyValue(10);
        this.setS(10);

    }

    public void convertCalc(){
        this.setS(100+s);
        System.out.println(s);
    }

}
