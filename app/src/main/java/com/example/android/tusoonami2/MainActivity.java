package com.example.android.tusoonami2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.text.SimpleDateFormat;

import Rest.TusoonamiClient;
import Rest.TusoonamiServer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


Feature feature;
    TextView titleTextView;
    TextView dateTextView;
    TextView tsunamiTextView;
    private String getDateString(long timeInMilliseconds) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy 'at' HH:mm:ss z");
        return formatter.format(timeInMilliseconds);
    }
    private String getTsunamiAlertString(int tsunamiAlert) {
        switch (tsunamiAlert) {
            case 0:
                return "yes";
            case 1:
                return "No";
            default:
                return "not found";
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,  "hiiiiiiiiiiiiiiii", Toast.LENGTH_SHORT).show();

loadData();
    }

    public void loadData()
    {
        final TusoonamiServer apiService =
                TusoonamiClient.getClient().create(TusoonamiServer.class);
        Call <Customclass> call = apiService.getUser();
           call.enqueue(new Callback <Customclass>() {
               @Override
               public void onResponse(Call <Customclass> call, Response <Customclass> response) {

                   Toast.makeText(MainActivity.this, response.body().getFeatures().get(4).getProperties().getTitle(), Toast.LENGTH_SHORT).show();


                       // Display the earthquake title in the UI
                       titleTextView = (TextView) findViewById(R.id.title);
                       titleTextView.setText(response.body().getFeatures().get(0).getProperties().getTitle());

                       // Display the earthquake date in the UI
                       tsunamiTextView = (TextView) findViewById(R.id.tsunami_alert);
                       tsunamiTextView.setText(getTsunamiAlertString(response.body().getFeatures().get(0).getProperties().getTsunami()));

               }
               @Override
               public void onFailure(Call <Customclass> call, Throwable t) {

               }
           });
    }
}
