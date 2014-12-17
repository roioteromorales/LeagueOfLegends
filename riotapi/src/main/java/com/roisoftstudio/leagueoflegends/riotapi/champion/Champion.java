package com.roisoftstudio.leagueoflegends.riotapi.champion;

public class Champion {

    private int id;
    private String key;
    private String name;
    private String title;

    public Champion(int id) {
        this.id = id;
    }

    public Champion withKey(String key) {
        this.key = key;
        return this;
    }

    public Champion withName(String name) {
        this.name = name;
        return this;
    }

    public Champion withTitle(String title) {
        this.title = title;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getName() + " - " + getTitle();
    }
}
