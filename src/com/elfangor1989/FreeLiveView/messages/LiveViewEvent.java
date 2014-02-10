package com.elfangor1989.FreeLiveView.messages;

import java.nio.ByteBuffer;

public abstract class LiveViewEvent extends LiveViewMessage {

    public LiveViewEvent(byte id) {
        super(id);
    }

    public abstract void readData(ByteBuffer buffer);

}
