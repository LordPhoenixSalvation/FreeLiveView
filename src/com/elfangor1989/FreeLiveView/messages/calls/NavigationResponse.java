package com.elfangor1989.FreeLiveView.messages.calls;

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

/**
 * @author Xperimental
 */
public class NavigationResponse extends LiveViewCall {

    private byte response;

    public NavigationResponse(byte response) {
        super(MessageConstants.MSG_NAVIGATION_RESP);
        this.response = response;
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        return new byte[] { response };
    }

}
