package com.wjj.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android Studio
 * #Author： 魏军杰
 * #Date： 2019-07-10
 * #Time：12:31
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
