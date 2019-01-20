package com.galvanize;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.*;

public class TelevisionTest {
    @Test
    public void instanceTest() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");
        HashMap<Integer, Channel> channels = new HashMap<>();
        channels.put(1, hbo);
        channels.put(2, showtime);
        channels.put(3, abc);
        Television television = new Television(channels);
        System.out.println(television);
    }

    @Test
    public void isOnTest() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");
        HashMap<Integer, Channel> channels = new HashMap<>();
        channels.put(1, hbo);
        channels.put(2, showtime);
        channels.put(3, abc);
        Television television = new Television(channels);
        assertFalse(television.isOn());
        television.turnOn();
        assertTrue(television.isOn());
        television.turnOff();
        assertFalse(television.isOn());
    }

    @Test
    public void channelTest() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");
        HashMap<Integer, Channel> channels = new HashMap<>();
        channels.put(1, hbo);
        channels.put(2, showtime);
        channels.put(3, abc);
        Television television = new Television(channels);
        assertEquals(hbo, television.currentChannel());
    }

    @Test
    public void increaseChannelTest(){
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");
        HashMap<Integer, Channel> channels = new HashMap<>();
        channels.put(1, hbo);
        channels.put(2, showtime);
        channels.put(3, abc);
        Television television = new Television(channels);
        television.increaseChannel();
        television.increaseChannel();
        television.increaseChannel();
        television.increaseChannel();
        assertEquals(showtime, television.currentChannel());
    }

    @Test
    public void decreaseChannelTest() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");
        HashMap<Integer, Channel> channels = new HashMap<>();
        channels.put(1, hbo);
        channels.put(2, showtime);
        channels.put(3, abc);
        Television television = new Television(channels);
        television.decreaseChannel();
        television.decreaseChannel();
        assertEquals(showtime, television.currentChannel());
    }
}
