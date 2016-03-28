package uk.co.ribot.androidboilerplate.data.model;

/**
 * Created by Administrator on 2016/3/25.
 */
public class SplashBody {


    /**
     * ClickUrl : String content
     * CreateDate : /Date(928120800000+0800)/
     * Id : 18446744073709551615
     * Image1 : String content
     * Image2 : String content
     * Image3 : String content
     * Image4 : String content
     * ModifyDate : /Date(928120800000+0800)/
     * Name : String content
     * StatUrl : String content
     * State : 32767
     * Type : 2147483647
     * Url : String content
     * UserId : 9223372036854775807
     * UsingDate : /Date(928120800000+0800)/
     */

    private String ClickUrl;
    private String CreateDate;
    private String Id;
    private String Image1;
    private String Image2;
    private String Image3;
    private String Image4;
    private String ModifyDate;
    private String Name;
    private String StatUrl;
    private int State;
    private int Type;
    private String Url;
    private long UserId;
    private String UsingDate;

    public String getClickUrl() {
        return ClickUrl;
    }

    public void setClickUrl(String ClickUrl) {
        this.ClickUrl = ClickUrl;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getImage1() {
        return Image1;
    }

    public void setImage1(String Image1) {
        this.Image1 = Image1;
    }

    public String getImage2() {
        return Image2;
    }

    public void setImage2(String Image2) {
        this.Image2 = Image2;
    }

    public String getImage3() {
        return Image3;
    }

    public void setImage3(String Image3) {
        this.Image3 = Image3;
    }

    public String getImage4() {
        return Image4;
    }

    public void setImage4(String Image4) {
        this.Image4 = Image4;
    }

    public String getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStatUrl() {
        return StatUrl;
    }

    public void setStatUrl(String StatUrl) {
        this.StatUrl = StatUrl;
    }

    public int getState() {
        return State;
    }

    public void setState(int State) {
        this.State = State;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long UserId) {
        this.UserId = UserId;
    }

    public String getUsingDate() {
        return UsingDate;
    }

    public void setUsingDate(String UsingDate) {
        this.UsingDate = UsingDate;
    }


    @Override
    public String toString() {
        return "SplashBody{" +
                "ClickUrl='" + ClickUrl + '\'' +
                ", CreateDate='" + CreateDate + '\'' +
                ", Id='" + Id + '\'' +
                ", Image1='" + Image1 + '\'' +
                ", Image2='" + Image2 + '\'' +
                ", Image3='" + Image3 + '\'' +
                ", Image4='" + Image4 + '\'' +
                ", ModifyDate='" + ModifyDate + '\'' +
                ", Name='" + Name + '\'' +
                ", StatUrl='" + StatUrl + '\'' +
                ", State=" + State +
                ", Type=" + Type +
                ", Url='" + Url + '\'' +
                ", UserId=" + UserId +
                ", UsingDate='" + UsingDate + '\'' +
                '}';
    }
}
