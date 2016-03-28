package uk.co.ribot.androidboilerplate.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import uk.co.ribot.androidboilerplate.R;
import uk.co.ribot.androidboilerplate.data.model.SplashBody;
import uk.co.ribot.androidboilerplate.ui.base.BaseActivity;
import uk.co.ribot.androidboilerplate.ui.main.MainActivity;
import uk.co.ribot.androidboilerplate.util.displayimg.DisplayUtil;

/**
 * Created by Administrator on 2016/3/18.
 */
public class SplashActivity extends BaseActivity implements SplashMvpView {
    @Inject
    SplashPresenter mSplashPresenter;
    @Bind(R.id.img)
    ImageView mImg;

    /**
     * Return an Intent to start this Activity.
     * triggerDataSyncOnCreate allows disabling the background sync service onCreate. Should
     * only be set to false during testing.
     */
    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        mSplashPresenter.attachView(this);
        mSplashPresenter.delayStartMainActivity();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(getStartIntent(SplashActivity.this));
                finish();
            }
        }, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSplashPresenter.detachView();
    }

    @Override
    public void showImage(SplashBody body) {
        DisplayUtil.loadImg(mImg, body.getImage4());
    }
}
