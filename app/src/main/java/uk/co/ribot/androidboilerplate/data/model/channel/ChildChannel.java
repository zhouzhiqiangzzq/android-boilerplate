package uk.co.ribot.androidboilerplate.data.model.channel;

import java.util.List;

/**
 * Created by Administrator on 2016/3/28.
 */
public class ChildChannel {
    private String ChannelIco;
    private int ChannelId;
    private String ChannelName;
    private String Description;
    private int OrderNum;
    private long ParentId;
    private List<ChildChannel> childChannel;

    public String getChannelIco() {
        return ChannelIco;
    }

    public void setChannelIco(String ChannelIco) {
        this.ChannelIco = ChannelIco;
    }

    public int getChannelId() {
        return ChannelId;
    }

    public void setChannelId(int ChannelId) {
        this.ChannelId = ChannelId;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(int OrderNum) {
        this.OrderNum = OrderNum;
    }

    public long getParentId() {
        return ParentId;
    }

    public void setParentId(long ParentId) {
        this.ParentId = ParentId;
    }

    public List<ChildChannel> getChildChannel() {
        return childChannel;
    }

    public void setChildChannel(List<ChildChannel> childChannel) {
        this.childChannel = childChannel;
    }

}
