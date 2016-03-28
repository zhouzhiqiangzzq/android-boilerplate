package uk.co.ribot.androidboilerplate.util.displayimg;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import uk.co.ribot.androidboilerplate.BoilerplateApplication;

/**
 * Created by Administrator on 2016/3/27.
 */
public class DisplayUtil {
    public static void loadImg(ImageView imgView, String uri) {
        Glide.with(BoilerplateApplication.getInstance()).load(uri).into(imgView);
    }
}
