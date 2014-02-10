package com.elfangor1989.FreeLiveView.messages.calls;
//Added by RN+

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

public class ClearDisplay extends LiveViewCall {
	
    public ClearDisplay() {
        super(MessageConstants.MSG_CLEARDISPLAY);
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        return new byte[] { 0 };
    }

}
