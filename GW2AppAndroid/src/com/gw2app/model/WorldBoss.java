package com.gw2app.model;

/**
 * Created by frankrui on 08/02/2015.
 */
public class WorldBoss extends Monster {

    private int time;
    private String name;
    private Location loc;
    private Item[] loot;


    //Construct a WorldBoss Object with spawn time and location
    public WorldBoss(int time, String name, Location loc, Item[] loot) {
        super(name,loc,loot);
        this.time = time;
    }
}
