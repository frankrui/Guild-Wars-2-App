package com.gw2app.model;

/**
 * Created by frankrui on 08/02/2015.
 */
public class Location extends GameObject {

    private String territory;
    private String area;

    public Location(String territory, String area) {
        this.territory = territory;
        this.area = area;
    }
}
