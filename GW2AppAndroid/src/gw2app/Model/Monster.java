package gw2app.Model;

/**
 * Created by frankrui on 08/02/2015.
 */
public class Monster extends GameObject {

    private String name;
    private Location loc;
    private Item loot[];

    public Monster (String name, Location loc, Item[] loot) {
        this.name = name;
        this.loc = loc;
        this.loot = loot;
    }

    public String getName() {
        return name;
    }

    public Location getLoc() {
        return loc;
    }

    public Item[] getLoot() {
        return loot;
    }
}
