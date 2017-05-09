package nl.borf.gamedb.model;

import java.io.Serializable;

/**
 * Created by johan on 2017-05-03.
 */

public class Game implements Serializable {
    private int id;
    private String name;
    private Platform platform;
    private String barcode;
    static int lastId = 10;

    public Game(String name, Platform platform, String barcode) {
        this.name = name;
        this.platform = platform;
        this.barcode = barcode;
        this.id = lastId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getId() {
        return id;
    }
}
