package uk.co.ribot.androidboilerplate.ui.main;

import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import uk.co.ribot.androidboilerplate.data.DataManager;
import uk.co.ribot.androidboilerplate.data.model.BaseListData;
import uk.co.ribot.androidboilerplate.data.model.article.Article;
import uk.co.ribot.androidboilerplate.data.model.channel.ChildChannel;
import uk.co.ribot.androidboilerplate.data.model.requestbody.MainChannelRequestBody;
import uk.co.ribot.androidboilerplate.ui.base.BasePresenter;

public class MainPresenter extends BasePresenter<MainMvpView> implements IMainPresenter {

    private final DataManager mDataManager;
    private Subscription mSubscription;

    @Inject
    public MainPresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void attachView(MainMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
        if (mSubscription != null) mSubscription.unsubscribe();
    }

    @Override
    public void loadChannelFromServer() {
        mSubscription = mDataManager.getRibotsService().getChildChannels()
                .flatMap(new Func1<BaseListData<ChildChannel>, Observable<ChildChannel>>() {
                    @Override
                    public Observable<ChildChannel> call(BaseListData<ChildChannel> childChannelBaseSingleData) {
                        Log.v("test2222", "从服务器获取到数据  渠道 ");
                        if (childChannelBaseSingleData.isIsSuc()) {
                            List<ChildChannel> listData = childChannelBaseSingleData.getResult();
                            //存到数据库
                            Log.v("test2222", "存到数据库   ");
                            if (listData != null) {
                                return Observable.from(listData);
                            } else {
                                return Observable.error(new Throwable("数据为空"));
                            }
                        } else {
                            return Observable.error(new Throwable("服务器返回数据错误"));
                        }
                    }
                })
                .doOnNext(new Action1<ChildChannel>() {
                    @Override
                    public void call(ChildChannel childChannel) {
                        mDataManager.getRibotsService().getArticleByChannelId(new MainChannelRequestBody(childChannel.getChannelId(), 10, "0"));
                    }
                })
                .flatMap(new Func1<ChildChannel, Observable<BaseListData<Article>>>() {
                    @Override
                    public Observable<BaseListData<Article>> call(ChildChannel childChannel) {
                        return mDataManager.getRibotsService().getArticleByChannelId(new MainChannelRequestBody(childChannel.getChannelId(), 10, "0"));
                    }
                })
                .flatMap(new Func1<BaseListData<Article>, Observable<List<Article>>>() {
                    @Override
                    public Observable<List<Article>> call(BaseListData<Article> childChannelBaseSingleData) {
                        Log.v("test2222", "从服务器获取到数据   ");
                        if (childChannelBaseSingleData.isIsSuc()) {
                            List<Article> listData = childChannelBaseSingleData.getResult();
                            //存到数据库
                            Log.v("test2222", "存数据库成功   文章");
                            if (listData != null) {
                                return Observable.just(listData);
                            } else {
                                return Observable.error(new Throwable("数据为空"));
                            }
                        } else {
                            return Observable.error(new Throwable("服务器返回数据错误"));
                        }
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Article>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Article> Articles) {
                        if (!isUnsubscribed()) {
                            if (getMvpView() != null && Articles != null) {
                                Log.v("test2222", Articles.toString());
                            }
                        }
                    }
                });


    }
}
