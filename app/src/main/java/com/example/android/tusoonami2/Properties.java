package com.example.android.tusoonami2;

import com.google.gson.annotations.SerializedName;

public class Properties {

    //@SerializedName("mag")
   // private Double mag;
    @SerializedName("place")
    private String place;
    //@SerializedName("time")
  //  private Integer time;
   // @SerializedName("updated")
    //private Integer updated;
    @SerializedName("url")
    private String url;
   // @SerializedName("felt")
   // private Integer felt;
    @SerializedName("alert")
    private String alert;
    @SerializedName("tsunami")
    private Integer tsunami;
    @SerializedName("title")
    private String title;


    public Properties(String place, String url, String alert, Integer tsunami, String title) {
        this.place = place;
        this.url = url;
        this.alert = alert;
        this.tsunami = tsunami;
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public String getUrl() {
        return url;
    }

    public String getAlert() {
        return alert;
    }

    public String getTitle() {
        return title;
    }

    public Integer getTsunami() {
        return tsunami;
    }
}
