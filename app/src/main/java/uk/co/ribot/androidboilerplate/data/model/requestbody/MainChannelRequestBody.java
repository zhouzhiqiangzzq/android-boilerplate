package uk.co.ribot.androidboilerplate.data.model.requestbody;

/**
 * Created by Administrator on 2016/3/28.
 */
public class MainChannelRequestBody {

    /**
     * channelid : 15
     * pagesize : 10
     * maxdate : 0
     */

    private int channelid;
    private int pagesize;
    private String maxdate;

    public MainChannelRequestBody(int channelid, int pagesize, String maxdate) {
        this.channelid = channelid;
        this.pagesize = pagesize;
        this.maxdate = maxdate;
    }

    public int getChannelid() {
        return channelid;
    }

    public void setChannelid(int channelid) {
        this.channelid = channelid;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }
}
