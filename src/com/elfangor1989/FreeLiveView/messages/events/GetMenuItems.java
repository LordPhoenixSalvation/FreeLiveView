package com.elfangor1989.FreeLiveView.messages.events;

import java.nio.ByteBuffer;

import com.elfangor1989.FreeLiveView.messages.LiveViewEvent;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

public class GetMenuItems extends LiveViewEvent {

    public GetMenuItems() {
        super(MessageConstants.MSG_GETMENUITEMS);
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
