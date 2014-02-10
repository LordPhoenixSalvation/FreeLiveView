package com.elfangor1989.FreeLiveView.messages.calls;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

//vibrationTime is in units of approximately 100ms

public class SetMenuSettings extends LiveViewCall {

    private final byte vibrationTime;
    private final byte initialMenuItemId;

    public SetMenuSettings(int vibrationTime, int initialMenuItemId) {
        super(MessageConstants.MSG_SETMENUSETTINGS);
        this.vibrationTime = (byte) vibrationTime;
        this.initialMenuItemId = (byte) initialMenuItemId;
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        ByteBuffer buffer = ByteBuffer.allocate(3);
        buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.put(vibrationTime);
        buffer.put((byte) 12);
        buffer.put(initialMenuItemId);
        return buffer.array();
    }

}
