package com.gw2app.model;

/**
 * Created by frankrui on 08/02/2015.
 */
public class Item extends GameObject {

    private String name;
    private String rarity;

    //Constructor
    public Item(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

}
