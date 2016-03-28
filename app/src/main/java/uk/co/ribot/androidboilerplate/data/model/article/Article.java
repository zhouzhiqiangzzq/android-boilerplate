package uk.co.ribot.androidboilerplate.data.model.article;

import java.util.List;

/**
 * Created by Administrator on 2016/3/28.
 */
public class Article {


    /**
     * ActivityId : 9223372036854775807
     * EndDate : /Date(928120800000+0800)/
     * JoinCount : 9223372036854775807
     * StartDate : /Date(928120800000+0800)/
     */

    private ContextEntity Context;
    /**
     * Context : {"ActivityId":9223372036854775807,"EndDate":"/Date(928120800000+0800)/","JoinCount":9223372036854775807,"StartDate":"/Date(928120800000+0800)/"}
     * CurrentPage : 9223372036854775807
     * Items : [{"AdminId":9223372036854775807,"ArticleId":9223372036854775807,"ArticleType":32767,"Author":"String content","AuthorIco":"String content","ChannelId":9223372036854775807,"ChannelParentId":9223372036854775807,"Content":"String content","CreateDate":"/Date(928120800000+0800)/","FavAmount":1.2678967543233E7,"FavCountForAd":9223372036854775807,"FavStaticCount":2147483647,"Flags":"String content","GroupPic":"String content","Ico":"String content","IcoHeight":9223372036854775807,"IcoWidth":9223372036854775807,"IsTop":32767,"PublishDate":"/Date(928120800000+0800)/","RefId":9223372036854775807,"Source":"String content","State":32767,"Summary":"String content","Tags":"String content","Title":"String content","TopEndDate":"/Date(928120800000+0800)/","TopStartDate":"/Date(928120800000+0800)/","Url":"String content","UserId":9223372036854775807,"VideoUrl":"String content","ViewAmount":1.2678967543233E7,"ViewCount":9223372036854775807,"ViewCountForAd":9223372036854775807,"ViewStaticCount":2147483647,"Activity":{"ActivityId":9223372036854775807,"EndDate":"/Date(928120800000+0800)/","JoinCount":9223372036854775807,"StartDate":"/Date(928120800000+0800)/","ActivityState":2147483647,"IsJoin":2147483647},"ArticlePictures":[{"ArticleId":9223372036854775807,"Id":9223372036854775807,"PicPath":"String content","Remark":"String content"}],"CommentCount":9223372036854775807,"FavCount":9223372036854775807,"IsFav":9223372036854775807,"IsJoin":2147483647,"OrderNum":9223372036854775807,"PublishNum":"String content","Vote":[{"Id":9223372036854775807,"OrderNum":2147483647,"Title":"String content","VoteCount":9223372036854775807,"VoteId":9223372036854775807,"EndDate":"/Date(928120800000+0800)/","IsJoin":2147483647,"StartDate":"/Date(928120800000+0800)/","VoteState":2147483647}]}]
     * ItemsPerPage : 9223372036854775807
     * TotalItems : 9223372036854775807
     * TotalPages : 9223372036854775807
     */

    private long CurrentPage;
    private long ItemsPerPage;
    private long TotalItems;
    private long TotalPages;
    /**
     * AdminId : 9223372036854775807
     * ArticleId : 9223372036854775807
     * ArticleType : 32767
     * Author : String content
     * AuthorIco : String content
     * ChannelId : 9223372036854775807
     * ChannelParentId : 9223372036854775807
     * Content : String content
     * CreateDate : /Date(928120800000+0800)/
     * FavAmount : 1.2678967543233E7
     * FavCountForAd : 9223372036854775807
     * FavStaticCount : 2147483647
     * Flags : String content
     * GroupPic : String content
     * Ico : String content
     * IcoHeight : 9223372036854775807
     * IcoWidth : 9223372036854775807
     * IsTop : 32767
     * PublishDate : /Date(928120800000+0800)/
     * RefId : 9223372036854775807
     * Source : String content
     * State : 32767
     * Summary : String content
     * Tags : String content
     * Title : String content
     * TopEndDate : /Date(928120800000+0800)/
     * TopStartDate : /Date(928120800000+0800)/
     * Url : String content
     * UserId : 9223372036854775807
     * VideoUrl : String content
     * ViewAmount : 1.2678967543233E7
     * ViewCount : 9223372036854775807
     * ViewCountForAd : 9223372036854775807
     * ViewStaticCount : 2147483647
     * Activity : {"ActivityId":9223372036854775807,"EndDate":"/Date(928120800000+0800)/","JoinCount":9223372036854775807,"StartDate":"/Date(928120800000+0800)/","ActivityState":2147483647,"IsJoin":2147483647}
     * ArticlePictures : [{"ArticleId":9223372036854775807,"Id":9223372036854775807,"PicPath":"String content","Remark":"String content"}]
     * CommentCount : 9223372036854775807
     * FavCount : 9223372036854775807
     * IsFav : 9223372036854775807
     * IsJoin : 2147483647
     * OrderNum : 9223372036854775807
     * PublishNum : String content
     * Vote : [{"Id":9223372036854775807,"OrderNum":2147483647,"Title":"String content","VoteCount":9223372036854775807,"VoteId":9223372036854775807,"EndDate":"/Date(928120800000+0800)/","IsJoin":2147483647,"StartDate":"/Date(928120800000+0800)/","VoteState":2147483647}]
     */

    private List<ItemsEntity> Items;

    public ContextEntity getContext() {
        return Context;
    }

    public void setContext(ContextEntity Context) {
        this.Context = Context;
    }

    public long getCurrentPage() {
        return CurrentPage;
    }

    public void setCurrentPage(long CurrentPage) {
        this.CurrentPage = CurrentPage;
    }

    public long getItemsPerPage() {
        return ItemsPerPage;
    }

    public void setItemsPerPage(long ItemsPerPage) {
        this.ItemsPerPage = ItemsPerPage;
    }

    public long getTotalItems() {
        return TotalItems;
    }

    public void setTotalItems(long TotalItems) {
        this.TotalItems = TotalItems;
    }

    public long getTotalPages() {
        return TotalPages;
    }

    public void setTotalPages(long TotalPages) {
        this.TotalPages = TotalPages;
    }

    public List<ItemsEntity> getItems() {
        return Items;
    }

    public void setItems(List<ItemsEntity> Items) {
        this.Items = Items;
    }

    public static class ContextEntity {
        private long ActivityId;
        private String EndDate;
        private long JoinCount;
        private String StartDate;

        public long getActivityId() {
            return ActivityId;
        }

        public void setActivityId(long ActivityId) {
            this.ActivityId = ActivityId;
        }

        public String getEndDate() {
            return EndDate;
        }

        public void setEndDate(String EndDate) {
            this.EndDate = EndDate;
        }

        public long getJoinCount() {
            return JoinCount;
        }

        public void setJoinCount(long JoinCount) {
            this.JoinCount = JoinCount;
        }

        public String getStartDate() {
            return StartDate;
        }

        public void setStartDate(String StartDate) {
            this.StartDate = StartDate;
        }
    }

    public static class ItemsEntity {
        private long AdminId;
        private long ArticleId;
        private int ArticleType;
        private String Author;
        private String AuthorIco;
        private long ChannelId;
        private long ChannelParentId;
        private String Content;
        private String CreateDate;
        private double FavAmount;
        private long FavCountForAd;
        private int FavStaticCount;
        private String Flags;
        private String GroupPic;
        private String Ico;
        private long IcoHeight;
        private long IcoWidth;
        private int IsTop;
        private String PublishDate;
        private long RefId;
        private String Source;
        private int State;
        private String Summary;
        private String Tags;
        private String Title;
        private String TopEndDate;
        private String TopStartDate;
        private String Url;
        private long UserId;
        private String VideoUrl;
        private double ViewAmount;
        private long ViewCount;
        private long ViewCountForAd;
        private int ViewStaticCount;
        /**
         * ActivityId : 9223372036854775807
         * EndDate : /Date(928120800000+0800)/
         * JoinCount : 9223372036854775807
         * StartDate : /Date(928120800000+0800)/
         * ActivityState : 2147483647
         * IsJoin : 2147483647
         */

        private ActivityEntity Activity;
        private long CommentCount;
        private long FavCount;
        private long IsFav;
        private int IsJoin;
        private long OrderNum;
        private String PublishNum;
        /**
         * ArticleId : 9223372036854775807
         * Id : 9223372036854775807
         * PicPath : String content
         * Remark : String content
         */

        private List<ArticlePicturesEntity> ArticlePictures;
        /**
         * Id : 9223372036854775807
         * OrderNum : 2147483647
         * Title : String content
         * VoteCount : 9223372036854775807
         * VoteId : 9223372036854775807
         * EndDate : /Date(928120800000+0800)/
         * IsJoin : 2147483647
         * StartDate : /Date(928120800000+0800)/
         * VoteState : 2147483647
         */

        private List<VoteEntity> Vote;

        public long getAdminId() {
            return AdminId;
        }

        public void setAdminId(long AdminId) {
            this.AdminId = AdminId;
        }

        public long getArticleId() {
            return ArticleId;
        }

        public void setArticleId(long ArticleId) {
            this.ArticleId = ArticleId;
        }

        public int getArticleType() {
            return ArticleType;
        }

        public void setArticleType(int ArticleType) {
            this.ArticleType = ArticleType;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String Author) {
            this.Author = Author;
        }

        public String getAuthorIco() {
            return AuthorIco;
        }

        public void setAuthorIco(String AuthorIco) {
            this.AuthorIco = AuthorIco;
        }

        public long getChannelId() {
            return ChannelId;
        }

        public void setChannelId(long ChannelId) {
            this.ChannelId = ChannelId;
        }

        public long getChannelParentId() {
            return ChannelParentId;
        }

        public void setChannelParentId(long ChannelParentId) {
            this.ChannelParentId = ChannelParentId;
        }

        public String getContent() {
            return Content;
        }

        public void setContent(String Content) {
            this.Content = Content;
        }

        public String getCreateDate() {
            return CreateDate;
        }

        public void setCreateDate(String CreateDate) {
            this.CreateDate = CreateDate;
        }

        public double getFavAmount() {
            return FavAmount;
        }

        public void setFavAmount(double FavAmount) {
            this.FavAmount = FavAmount;
        }

        public long getFavCountForAd() {
            return FavCountForAd;
        }

        public void setFavCountForAd(long FavCountForAd) {
            this.FavCountForAd = FavCountForAd;
        }

        public int getFavStaticCount() {
            return FavStaticCount;
        }

        public void setFavStaticCount(int FavStaticCount) {
            this.FavStaticCount = FavStaticCount;
        }

        public String getFlags() {
            return Flags;
        }

        public void setFlags(String Flags) {
            this.Flags = Flags;
        }

        public String getGroupPic() {
            return GroupPic;
        }

        public void setGroupPic(String GroupPic) {
            this.GroupPic = GroupPic;
        }

        public String getIco() {
            return Ico;
        }

        public void setIco(String Ico) {
            this.Ico = Ico;
        }

        public long getIcoHeight() {
            return IcoHeight;
        }

        public void setIcoHeight(long IcoHeight) {
            this.IcoHeight = IcoHeight;
        }

        public long getIcoWidth() {
            return IcoWidth;
        }

        public void setIcoWidth(long IcoWidth) {
            this.IcoWidth = IcoWidth;
        }

        public int getIsTop() {
            return IsTop;
        }

        public void setIsTop(int IsTop) {
            this.IsTop = IsTop;
        }

        public String getPublishDate() {
            return PublishDate;
        }

        public void setPublishDate(String PublishDate) {
            this.PublishDate = PublishDate;
        }

        public long getRefId() {
            return RefId;
        }

        public void setRefId(long RefId) {
            this.RefId = RefId;
        }

        public String getSource() {
            return Source;
        }

        public void setSource(String Source) {
            this.Source = Source;
        }

        public int getState() {
            return State;
        }

        public void setState(int State) {
            this.State = State;
        }

        public String getSummary() {
            return Summary;
        }

        public void setSummary(String Summary) {
            this.Summary = Summary;
        }

        public String getTags() {
            return Tags;
        }

        public void setTags(String Tags) {
            this.Tags = Tags;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getTopEndDate() {
            return TopEndDate;
        }

        public void setTopEndDate(String TopEndDate) {
            this.TopEndDate = TopEndDate;
        }

        public String getTopStartDate() {
            return TopStartDate;
        }

        public void setTopStartDate(String TopStartDate) {
            this.TopStartDate = TopStartDate;
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

        public String getVideoUrl() {
            return VideoUrl;
        }

        public void setVideoUrl(String VideoUrl) {
            this.VideoUrl = VideoUrl;
        }

        public double getViewAmount() {
            return ViewAmount;
        }

        public void setViewAmount(double ViewAmount) {
            this.ViewAmount = ViewAmount;
        }

        public long getViewCount() {
            return ViewCount;
        }

        public void setViewCount(long ViewCount) {
            this.ViewCount = ViewCount;
        }

        public long getViewCountForAd() {
            return ViewCountForAd;
        }

        public void setViewCountForAd(long ViewCountForAd) {
            this.ViewCountForAd = ViewCountForAd;
        }

        public int getViewStaticCount() {
            return ViewStaticCount;
        }

        public void setViewStaticCount(int ViewStaticCount) {
            this.ViewStaticCount = ViewStaticCount;
        }

        public ActivityEntity getActivity() {
            return Activity;
        }

        public void setActivity(ActivityEntity Activity) {
            this.Activity = Activity;
        }

        public long getCommentCount() {
            return CommentCount;
        }

        public void setCommentCount(long CommentCount) {
            this.CommentCount = CommentCount;
        }

        public long getFavCount() {
            return FavCount;
        }

        public void setFavCount(long FavCount) {
            this.FavCount = FavCount;
        }

        public long getIsFav() {
            return IsFav;
        }

        public void setIsFav(long IsFav) {
            this.IsFav = IsFav;
        }

        public int getIsJoin() {
            return IsJoin;
        }

        public void setIsJoin(int IsJoin) {
            this.IsJoin = IsJoin;
        }

        public long getOrderNum() {
            return OrderNum;
        }

        public void setOrderNum(long OrderNum) {
            this.OrderNum = OrderNum;
        }

        public String getPublishNum() {
            return PublishNum;
        }

        public void setPublishNum(String PublishNum) {
            this.PublishNum = PublishNum;
        }

        public List<ArticlePicturesEntity> getArticlePictures() {
            return ArticlePictures;
        }

        public void setArticlePictures(List<ArticlePicturesEntity> ArticlePictures) {
            this.ArticlePictures = ArticlePictures;
        }

        public List<VoteEntity> getVote() {
            return Vote;
        }

        public void setVote(List<VoteEntity> Vote) {
            this.Vote = Vote;
        }

        public static class ActivityEntity {
            private long ActivityId;
            private String EndDate;
            private long JoinCount;
            private String StartDate;
            private int ActivityState;
            private int IsJoin;

            public long getActivityId() {
                return ActivityId;
            }

            public void setActivityId(long ActivityId) {
                this.ActivityId = ActivityId;
            }

            public String getEndDate() {
                return EndDate;
            }

            public void setEndDate(String EndDate) {
                this.EndDate = EndDate;
            }

            public long getJoinCount() {
                return JoinCount;
            }

            public void setJoinCount(long JoinCount) {
                this.JoinCount = JoinCount;
            }

            public String getStartDate() {
                return StartDate;
            }

            public void setStartDate(String StartDate) {
                this.StartDate = StartDate;
            }

            public int getActivityState() {
                return ActivityState;
            }

            public void setActivityState(int ActivityState) {
                this.ActivityState = ActivityState;
            }

            public int getIsJoin() {
                return IsJoin;
            }

            public void setIsJoin(int IsJoin) {
                this.IsJoin = IsJoin;
            }
        }

        public static class ArticlePicturesEntity {
            private long ArticleId;
            private long Id;
            private String PicPath;
            private String Remark;

            public long getArticleId() {
                return ArticleId;
            }

            public void setArticleId(long ArticleId) {
                this.ArticleId = ArticleId;
            }

            public long getId() {
                return Id;
            }

            public void setId(long Id) {
                this.Id = Id;
            }

            public String getPicPath() {
                return PicPath;
            }

            public void setPicPath(String PicPath) {
                this.PicPath = PicPath;
            }

            public String getRemark() {
                return Remark;
            }

            public void setRemark(String Remark) {
                this.Remark = Remark;
            }
        }

        public static class VoteEntity {
            private long Id;
            private int OrderNum;
            private String Title;
            private long VoteCount;
            private long VoteId;
            private String EndDate;
            private int IsJoin;
            private String StartDate;
            private int VoteState;

            public long getId() {
                return Id;
            }

            public void setId(long Id) {
                this.Id = Id;
            }

            public int getOrderNum() {
                return OrderNum;
            }

            public void setOrderNum(int OrderNum) {
                this.OrderNum = OrderNum;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public long getVoteCount() {
                return VoteCount;
            }

            public void setVoteCount(long VoteCount) {
                this.VoteCount = VoteCount;
            }

            public long getVoteId() {
                return VoteId;
            }

            public void setVoteId(long VoteId) {
                this.VoteId = VoteId;
            }

            public String getEndDate() {
                return EndDate;
            }

            public void setEndDate(String EndDate) {
                this.EndDate = EndDate;
            }

            public int getIsJoin() {
                return IsJoin;
            }

            public void setIsJoin(int IsJoin) {
                this.IsJoin = IsJoin;
            }

            public String getStartDate() {
                return StartDate;
            }

            public void setStartDate(String StartDate) {
                this.StartDate = StartDate;
            }

            public int getVoteState() {
                return VoteState;
            }

            public void setVoteState(int VoteState) {
                this.VoteState = VoteState;
            }
        }
    }
}
