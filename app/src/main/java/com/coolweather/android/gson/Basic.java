package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    public String city;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
