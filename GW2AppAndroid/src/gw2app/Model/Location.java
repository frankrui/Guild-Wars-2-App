package gw2app.Model;

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
