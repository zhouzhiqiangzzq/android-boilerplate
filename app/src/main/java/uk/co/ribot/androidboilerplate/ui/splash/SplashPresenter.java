package uk.co.ribot.androidboilerplate.ui.splash;

import android.util.Log;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import uk.co.ribot.androidboilerplate.data.DataManager;
import uk.co.ribot.androidboilerplate.data.model.BaseSingleData;
import uk.co.ribot.androidboilerplate.data.model.requestbody.SplashRequestBody;
import uk.co.ribot.androidboilerplate.data.model.SplashBody;
import uk.co.ribot.androidboilerplate.ui.base.BasePresenter;

/**
 * Created by Administrator on 2016/3/18.
 */
public class SplashPresenter extends BasePresenter<SplashMvpView> implements ISplashPresenter {
    private final DataManager mDataManager;
    private Subscription mSubscription;

    @Inject
    public SplashPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void attachView(SplashMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
        if (mSubscription != null) mSubscription.unsubscribe();
    }

    @Override
    public void delayStartMainActivity() {
        mSubscription = mDataManager.getRibotsService().getSplashDetail(new SplashRequestBody("0"))
                .flatMap(new Func1<BaseSingleData<SplashBody>, Observable<SplashBody>>() {
                    @Override
                    public Observable<SplashBody> call(BaseSingleData<SplashBody> splashBodyBaseSingleData) {
                        Log.v("test2222", "从服务器获取到数据   ");
                        if (splashBodyBaseSingleData.isIsSuc()) {
                            SplashBody splashBody = splashBodyBaseSingleData.getResult();
                            if (splashBody != null) {
                                return Observable.just(splashBodyBaseSingleData.getResult());
                            } else {
                                return Observable.error(new Throwable("数据为空"));
                            }
                        } else {
                            return Observable.error(new Throwable("服务器返回数据错误"));
                        }
                    }
                })
                .doOnNext(new Action1<SplashBody>() {
                    @Override
                    public void call(SplashBody splashBody) {
                        //TODO save data to dataase
                        Log.v("test2222", "存数据库成功   ");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).
                        subscribe(new Subscriber<SplashBody>() {
                            @Override
                            public void onCompleted() {
                                Log.v("test2222", "onCompleted");
                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.v("test2222", "onError   " + e.toString());
                            }

                            @Override
                            public void onNext(SplashBody splashBodyBaseSingleData) {
                                if (!isUnsubscribed()) {
                                    if (getMvpView() != null && splashBodyBaseSingleData != null) {
                                        Log.v("test2222", splashBodyBaseSingleData.toString());
                                        getMvpView().showImage(splashBodyBaseSingleData);
                                    }
                                }
                            }
                        });
    }
}
