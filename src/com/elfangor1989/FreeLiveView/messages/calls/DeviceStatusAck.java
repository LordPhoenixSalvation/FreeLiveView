package com.elfangor1989.FreeLiveView.messages.calls;

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

public class DeviceStatusAck extends LiveViewCall {

    public DeviceStatusAck() {
        super(MessageConstants.MSG_DEVICESTATUS_ACK);
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        return new byte[] { MessageConstants.RESULT_OK };
    }

}
