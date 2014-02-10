package com.elfangor1989.FreeLiveView.messages.calls;

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

public class SetMenuSize extends LiveViewCall {

    private final byte menuSize;

    public SetMenuSize(byte menuSize) {
        super(MessageConstants.MSG_SETMENUSIZE);
        this.menuSize = menuSize;
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        return new byte[] { menuSize };
    }

}
