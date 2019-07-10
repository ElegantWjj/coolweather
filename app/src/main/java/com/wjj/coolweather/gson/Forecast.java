package com.wjj.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android Studio
 * #Author： 魏军杰
 * #Date： 2019-07-10
 * #Time：12:41
 */
public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {
        public String max;
        public String min;
    }

}
