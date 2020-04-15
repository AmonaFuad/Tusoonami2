package com.example.android.tusoonami2;

import com.google.gson.annotations.SerializedName;

class Feature {
    @SerializedName("properties")
    private Properties properties;

    public Feature(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }
}
