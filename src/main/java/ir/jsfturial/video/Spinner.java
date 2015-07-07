package ir.jsfturial.video;

import javax.enterprise.inject.Model;

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
