package uk.co.ribot.androidboilerplate.data.model;

/**
 * Created by Administrator on 2016/3/25.
 */
public class CommonData {
    /**
     * code : 0
     * isSuc : true
     * message : String content
     * name : String content
     * nextpublishtime : /Date(928120800000+0800)/
     * servertime : /Date(928120800000+0800)/
     */

    private int code;
    private boolean isSuc;
    private String message;
    private String name;
    private String nextpublishtime;
    private String servertime;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isIsSuc() {
        return isSuc;
    }

    public void setIsSuc(boolean isSuc) {
        this.isSuc = isSuc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNextpublishtime() {
        return nextpublishtime;
    }

    public void setNextpublishtime(String nextpublishtime) {
        this.nextpublishtime = nextpublishtime;
    }

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime;
    }
}
