package uk.co.ribot.androidboilerplate.ui.splash;

import uk.co.ribot.androidboilerplate.data.model.SplashBody;
import uk.co.ribot.androidboilerplate.ui.base.MvpView;

/**
 * Created by Administrator on 2016/3/18.
 */
public interface SplashMvpView extends MvpView {
    public void showImage(SplashBody body);

}
