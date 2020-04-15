package Rest;

import com.example.android.tusoonami2.Customclass;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TusoonamiServer {
    @GET("fdsnws/event/1/query?format=geojson&minmag=6&limit=5")
    Call <Customclass> getUser();

}
