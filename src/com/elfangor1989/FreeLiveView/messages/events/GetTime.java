package com.elfangor1989.FreeLiveView.messages.events;

import java.nio.ByteBuffer;

import com.elfangor1989.FreeLiveView.messages.LiveViewEvent;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

public class GetTime extends LiveViewEvent {

    public GetTime() {
        super(MessageConstants.MSG_GETTIME);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.sourcewalker.olv.messages.LiveViewResponse#readData(java.nio.ByteBuffer
     * )
     */
    @Override
    public void readData(ByteBuffer buffer) {
    }

}
