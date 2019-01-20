package com.galvanize;

import java.util.HashMap;

public class Television {
    private HashMap<Integer, Channel> channels = new HashMap<>();
    private int currentStation = 1;
    private boolean isOn = false;

    public Television(HashMap<Integer, Channel> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "Television{" +
                "channels=" + channels +
                ", currentStation=" + currentStation +
                ", isOn=" + isOn +
                '}';
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public Channel currentChannel() {
        return channels.get(currentStation);
    }

    public void increaseChannel() {
        currentStation++;
        if(currentStation > channels.size()) {
            currentStation = 1;
        }
    }

    public void decreaseChannel() {
        currentStation--;
        if(currentStation <= 0) {
            currentStation = channels.size();
        }
    }
}
