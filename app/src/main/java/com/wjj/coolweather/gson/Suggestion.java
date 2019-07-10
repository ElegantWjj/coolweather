package com.wjj.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android Studio
 * #Author： 魏军杰
 * #Date： 2019-07-10
 * #Time：12:37
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
