package com.example.android.tusoonami2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Customclass {
    @SerializedName("type")
    private String type;
    @SerializedName("features")
    private List <Feature> features = null;

    public Customclass(String type, List <Feature> features) {
        this.type = type;
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public List <Feature> getFeatures() {
        return features;
    }
}

