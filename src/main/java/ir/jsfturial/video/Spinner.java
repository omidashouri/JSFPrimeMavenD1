package ir.jsfturial.video;

import javax.enterprise.inject.Model;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by ashouri on 6/30/2015.
 */
@Model
public class Spinner {
    int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
