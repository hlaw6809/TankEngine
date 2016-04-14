package model;

/**
 * Created by Henry on 4/12/2016.
 */
public class TankConfiguration {
    public final int tps;
    public final int windowWidth;
    public final int windowHeight;

    public TankConfiguration(int tps, int windowWidth, int windowHeight) {
        this.tps = tps;
        this.windowHeight = windowHeight;
        this.windowWidth = windowWidth;
    }
}
