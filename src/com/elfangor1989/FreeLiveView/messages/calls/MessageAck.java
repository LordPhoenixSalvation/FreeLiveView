package com.elfangor1989.FreeLiveView.messages.calls;

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

/**
 * @author Xperimental
 */
public class MessageAck extends LiveViewCall {

    private final byte ackMsgId;

    public MessageAck(byte ackMsgId) {
        super(MessageConstants.MSG_ACK);
        this.ackMsgId = ackMsgId;
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        return new byte[] { ackMsgId };
    }

}
