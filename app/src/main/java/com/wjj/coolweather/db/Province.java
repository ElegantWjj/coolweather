package com.wjj.coolweather.db;

/**
 * Created by Android Studio
 * #Author： 魏军杰
 * #Date： 2019-07-09
 * #Time：15:04
 */

import org.litepal.crud.LitePalSupport;

/**
 * 省份信息
 */
public class Province extends LitePalSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
