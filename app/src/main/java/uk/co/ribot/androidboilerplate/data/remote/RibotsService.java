package uk.co.ribot.androidboilerplate.data.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;
import uk.co.ribot.androidboilerplate.BoilerplateApplication;
import uk.co.ribot.androidboilerplate.data.model.BaseListData;
import uk.co.ribot.androidboilerplate.data.model.BaseSingleData;
import uk.co.ribot.androidboilerplate.data.model.article.Article;
import uk.co.ribot.androidboilerplate.data.model.requestbody.MainChannelRequestBody;
import uk.co.ribot.androidboilerplate.data.model.requestbody.SplashRequestBody;
import uk.co.ribot.androidboilerplate.data.model.SplashBody;
import uk.co.ribot.androidboilerplate.data.model.channel.ChildChannel;

public interface RibotsService {
    String ENDPOINT = "http://cosmoweb.metshow.com/api/";

    /********
     * Helper class that sets up a new services
     *******/
    class Creator {
        public static RibotsService newRibotsService() {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .create();
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(Level.BODY);
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(logging);  // <-- this is the important line!

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(RibotsService.ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(httpClient.cache(new okhttp3.Cache(new File(BoilerplateApplication.getInstance().getCacheDir(), "HttpResponseCache"), 1024 * 1024 * 10)).build())
                    .build();
            return retrofit.create(RibotsService.class);
        }
    }

    @POST("splash/list")
    Observable<BaseSingleData<SplashBody>> getSplashDetail(@Body SplashRequestBody body);

    @POST("channel/list")
    Observable<BaseListData<ChildChannel>> getChildChannels();

    @POST("article/list")
    Observable<BaseListData<Article>> getArticleByChannelId(@Body MainChannelRequestBody body);

}
