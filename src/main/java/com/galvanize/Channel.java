package com.galvanize;

public class Channel {
    private int station;
    private String name;

    public Channel(int station, String name) {
        this.station = station;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "station=" + station +
                ", name='" + name + '\'' +
                '}';
    }
}
