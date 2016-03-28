package uk.co.ribot.androidboilerplate.data.model.requestbody;

/**
 * Created by Administrator on 2016/3/27.
 */
public class SplashRequestBody {
    public String date;


    public SplashRequestBody(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
