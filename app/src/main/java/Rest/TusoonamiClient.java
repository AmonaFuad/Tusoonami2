package Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TusoonamiClient {


    public static final String BASE_URL = "https://earthquake.usgs.gov/";
    private static Retrofit tsoonamiRetrofit = null;


    public static Retrofit getClient() {
        if (tsoonamiRetrofit==null) {
            tsoonamiRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return tsoonamiRetrofit;
    }

}
