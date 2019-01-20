package com.galvanize;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChannelTest {
    @Test
    public void instanceTest() {
        Channel channel = new Channel(1, "HBO");
        assertEquals("Channel{station=1, name='HBO'}", channel.toString());
    }
}
